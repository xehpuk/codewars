function nextBigger(n) {
  const digits = digitize(n)
  const index = digits.findIndex((d, i) => digits[i - 1] > d)
  if (index === -1) {
    return -1
  }
  const right = digits.slice(index + 1)
  const pivot = digits[index]
  const left = digits.slice(0, index + 1).sort((m, n) => m - n)
  const promotedIndex = left.findIndex(n => n > pivot)
  const promoted = left[promotedIndex]
  left.splice(promotedIndex, 1)
  const result = [
    ...left.reverse(),
    promoted,
    ...right
  ].reverse().reduce((reversed, digit) => 10 * reversed + digit)
  return result
}

function digitize(n) {
  const digits = []
  do {
    digits.push(n % 10)
  } while ((n = Math.trunc(n / 10)) > 0)
  return digits
}