const sum_pairs = (ints, s) => {
  const c = new Set().add(ints[0])
  for (let i = 1; i < ints.length; i++) {
    const n = ints[i]
    const m = s - n
    if (c.has(m)) {
      return [m, n]
    }
    c.add(n)
  }
}