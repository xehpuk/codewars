function car(p, n) {
  for (var i = 1; i <= n; i++) {
    p *= 1 - depreciation(i);
  }
  return p.toFixed(2);
}

function depreciation(n) {
  return n < 3 ? .2 : .1;
}