function queueTime(customers, n) {
  if (customers.length === 0) {
    return 0
  }
  
  const l = Math.min(customers.length, n)
  const tills = customers.slice(0, l)
  let time = 0
  for (let i = l; i < customers.length; i++) {
    const min = Math.min(...tills)
    for (let j = 0; j < l; j++) {
      tills[j] -= min
    }
    time += min
    for (let j = 0; j < l; j++) {
      if (tills[j] === 0) {
        tills[j] = customers[i]
        break
      }
    }
  }
  
  return time + Math.max(...tills)
}