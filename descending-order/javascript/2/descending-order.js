function descendingOrder(n) {
  const digits = []
  do {
    digits.push(n % 10)
  } while ((n = Math.trunc(n / 10)) > 0)
  return digits.sort((a, b) => b - a)
               .reduce((reversed, digit) => 10 * reversed + digit)
}