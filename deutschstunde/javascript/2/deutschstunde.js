function derDieDas(wort) {
  return ['das', 'die', 'der'][Math.min(~~((wort.match(/[aäeioöuü]/gi) || []).length / 2), 2)] + ' ' + wort;
}