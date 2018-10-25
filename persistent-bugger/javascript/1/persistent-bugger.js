const BASE = 10;

function persistence(n, i = 0) {
  return n < BASE
    ? i
    : persistence(digitProduct(n), i + 1)
}
  
function digitProduct(n, p = 1) {
  return n < BASE
    ? n * p
    : digitProduct(n / BASE | 0, n % BASE * p)
}