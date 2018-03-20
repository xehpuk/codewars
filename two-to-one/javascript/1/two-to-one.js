function longest(s1, s2) {
  return Array.from(new Set([ ...Array.from(s1), ...Array.from(s2) ])).sort().join('')
}