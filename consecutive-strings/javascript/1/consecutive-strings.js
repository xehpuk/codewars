function longestConsec(strarr, k) {
  const n = strarr.length

  if (n === 0 || k > n || k <= 0) {
    return ''
  }

  let j = -1
  for (let i = 0, max = -1; i <= n - k; i++) {
    let current = 0
    for (let l = 0; l < k; l++) {
      current += strarr[i + l].length
    }
    if (current > max) {
      j = i
      max = current
    }
  }

  let str = ''
  for (let i = 0; i < k; i++) {
    str += strarr[i + j]
  }

  return str
}