function sumDigits(number) {
  return (function f(n, sum) {
    return n
      ? f(Math.trunc(n / 10), sum + n % 10)
      : sum
  })(Math.abs(number), 0)
}