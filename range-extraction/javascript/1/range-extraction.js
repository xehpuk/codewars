function solution(list) {
  if (list.length === 0) {
    return ''
  }

  const ranges = []
  let range = init(list[0])
  
  for (let i = 1; i < list.length; i++) {
    const n = list[i]
    if (n === range.end + 1) {
      range.end = n
    } else {
      ranges.push(range)
      range = init(n)
    }
  }
  ranges.push(range)
  
  return ranges.map(r => r.start === r.end
    ? r.end
    : r.start + (r.start === r.end - 1 ? ',' : '-') + r.end).join()
}

function init(n) {
  return {
    start: n,
    end: n
  }
}