function isMultiple(a, b, n) {
  const q = a / b
  const r = Math.round((q - (q | 0)) * 10)
  return !!r && !(r % n)
}