function getLines(n) {
  if (isNaN(n) || n <= 0) {
    return -1;
  }
  var lines = new Array(n);
  lines[0] = '1';
  for (var i = 1; i < n; i++) {
    lines[i] = lines[i - 1].match(/(.)\1*/g).map(function(m) {
      return m.length + m[0];
    }).join('');
  }
  return lines.join();
}