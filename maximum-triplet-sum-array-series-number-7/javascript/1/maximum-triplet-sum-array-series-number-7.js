function maxTriSum(numbers) {
  return Array.from(new Set(numbers))
              .sort((a, b) => b - a)
              .slice(0, 3)
              .reduce((sum, n) => sum + n, 0)
}