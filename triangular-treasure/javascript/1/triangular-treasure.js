function triangular(n) {
  var t = 0;
  for (var i = 1; i <= n; t += i++);
  return t;
}