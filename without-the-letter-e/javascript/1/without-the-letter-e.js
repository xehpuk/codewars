function findE(str) {
  if (!str) {
    return str
  }
  const count = Array.from(str.toLowerCase()).filter(c => c === 'e').length
  return count === 0
    ? 'There is no "e".'
    : String(count)
}