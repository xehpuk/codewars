function getFunction(sequence) {
  var m = sequence[0];
  var n = sequence[1] - m;
  for (var i = 1; i < sequence.length - 1; i++) {
    if (sequence[i + 1] - sequence[i] !== n) {
      return 'Non-linear sequence';
    }
  }
  return function(x) {
    return n * x + m;
  };
}