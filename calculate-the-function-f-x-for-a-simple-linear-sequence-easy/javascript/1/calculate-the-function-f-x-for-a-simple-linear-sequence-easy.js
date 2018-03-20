function getFunction(sequence) {
  var m = sequence[0];
  var n = sequence[1] - m;
  for (var i = 1; i < sequence.length - 1; i++) {
    if (sequence[i + 1] - sequence[i] !== n) {
      return 'Non-linear sequence';
    }
  }
  return 'f(x) = ' + (n === 0 ? m
                              : (n === 1 ? ''
                                         : n === -1 ? '-'
                                                    : n) + 'x' + (m === 0 ? ''
                                                                          : m < 0 ? ' - ' + -m
                                                                                  : ' + ' + m));
}