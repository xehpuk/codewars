function countPositivesSumNegatives(input) {
  return input
    ? input.reduce(([countOfPositives = 0, sumOfNegatives = 0], n) => n > 0
      ? [countOfPositives + 1, sumOfNegatives]
      : [countOfPositives, sumOfNegatives + n], [])
    : []
}