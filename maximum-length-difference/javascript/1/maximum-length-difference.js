function mxdiflg(a1, a2) {
  if (a1.length === 0 || a2.length === 0) {
    return -1
  }
  
  const [min1, max1] = minmax(a1)
  const [min2, max2] = minmax(a2)
  
  return Math.max(Math.abs(max1 - min2), Math.abs(max2 - min1))
}

function minmax(a) {
  const first = a[0].length
  let min = first
  let max = first
  
  for (let i = 1; i < a.length; i++) {
    const l = a[i].length
    if (l < min) {
      min = l
    } else if (l > max) {
      max = l
    }
  }
  
  return [min, max]
}