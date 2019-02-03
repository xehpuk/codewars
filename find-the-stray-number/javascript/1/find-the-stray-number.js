function stray(numbers) {
  return numbers.reduce((m, n) => m ^ n)
}