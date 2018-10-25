function minMax(arr) {
  let min = Number.MAX_VALUE
  let max = Number.MIN_VALUE
  
  for (const n of arr) {
    min = Math.min(min, n)
    max = Math.max(max, n)
  }
  
  return [min, max]
}