const BASE = 10

function computeDepth(x) {
  const moreDigits = (function(digits) {
    return function(n) {
      do {
        digits.add(n % BASE)
      } while ((n = Math.trunc(n / BASE)) > 0)
      
      return digits.size < BASE
    }
  }(new Set()))
  
  for (var i = 1; moreDigits(i * x); i++);
  
  return i
}