function sortByHeight(a) {
  const people = a.filter(e => e !== -1).sort((p, p2) => p - p2)
  
  let i = 0
  
  return a.map(e => e === -1 ? e : people[i++])
}