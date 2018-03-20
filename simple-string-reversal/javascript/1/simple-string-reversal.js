function solve(str) {
  let s = Array(str.length).fill(' ')
  for (let i = 0, l = str.length, j = l; i < j; i++) {
    const c = str[i]
    if (c !== ' ') {
      s[i] = str[j = findLastNonSpace(str, j - 1)]
      s[j] = c
    }
  }
  return s.join('')
}

function findLastNonSpace(str, fromIndex) {
  return str[fromIndex] !== ' '
    ? fromIndex
    : findLastNonSpace(str, fromIndex - 1)
}