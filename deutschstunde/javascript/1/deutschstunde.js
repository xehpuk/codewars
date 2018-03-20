function derDieDas(wort) {
  return bestimmterArtikel(vokalAnzahl(wort)) + ' ' + wort;
}

function bestimmterArtikel(vokalAnzahl) {
  switch (vokalAnzahl) {
    case 0:
    case 1:
      return 'das';
    case 2:
    case 3:
      return 'die';
    default:
      return 'der';
  }
}

function vokalAnzahl(wort) {
  return (wort.match(/[aäeioöuü]/gi) || []).length;
}