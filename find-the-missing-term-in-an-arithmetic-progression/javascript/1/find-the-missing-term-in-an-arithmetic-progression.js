const findMissing = function (list) {
  const { 0: first, length } = list
  const step = (list[length - 1] - first) / length
  for (let i = 0;; i++) {
    const expected = first + i * step
    if (list[i] !== expected) {
      return expected
    }
  }
}