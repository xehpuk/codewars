function sortArray(array) {
  const result = array.slice()
  const indexes = []
  const odds = []
  array.forEach((n, i) => {
    if (n % 2 === 1) {
      indexes.push(i)
      odds.push(n)
    }
  })
  odds.sort((m, n) => m - n).forEach((n, i) => {
    result[indexes[i]] = n
  })
  return result
}