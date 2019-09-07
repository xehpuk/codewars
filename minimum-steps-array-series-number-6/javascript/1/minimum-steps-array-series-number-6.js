function minimumSteps(numbers, value) {
  numbers.sort((a, b) => a - b)
  for (let i = 0, sum = 0;; i++) {
    sum += numbers[i]
    if (sum >= value) {
      return i
    }
  }
}