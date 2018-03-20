function getMiddle(s) {
  const l = s.length / 2
  return s.substring(Math.floor(l - 0.5), l + 1)
}