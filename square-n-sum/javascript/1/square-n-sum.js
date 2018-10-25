function squareSum(numbers) {
  return numbers.reduce((sum, n) => sum + n * n, 0);
}