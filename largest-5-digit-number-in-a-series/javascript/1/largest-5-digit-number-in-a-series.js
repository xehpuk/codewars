function solution(digits) {
  let max = digits.substr(0, 5)
  for (let i = 1; i <= digits.length - 5; i++) {
    const next = digits.substr(i, 5)
    if (next > max) {
      max = next
    }
  }
  return +max
}