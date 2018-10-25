function positiveSum(arr) {
  return arr.reduce((sum, n) => n > 0 ? sum + n : sum, 0);
}