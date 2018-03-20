function countSquares(n) {
  var count = 0;
  for (var i = 1; i <= n; count += i * i, i++);
  return count;
}