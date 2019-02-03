function queueTime(customers, n) {
  const tills = Array(n).fill(0)
  for (const customer of customers) {
    tills[tills.reduce((j, till, i) => till < tills[j] ? i : j, 0)] += customer
  }
  return Math.max(...tills)
}