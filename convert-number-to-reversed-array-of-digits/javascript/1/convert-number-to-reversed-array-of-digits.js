function digitize(n) {
  return n === 0 ? [] : [ n % 10, ...digitize(Math.trunc(n / 10)) ]
}