function findSum(n) {
  let sum = 0
  for (let i = 1; i <= n / 3; i++) {
    sum += i * 3
  }
  for (let i = 1; i <= n / 5; i++) {
    if (i % 3) {
      sum += i * 5
    }
  }
  return sum;
}