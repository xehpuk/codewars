function isDivisible(n, ...divisors) {
  return divisors.every(divisor => n % divisor === 0)
}