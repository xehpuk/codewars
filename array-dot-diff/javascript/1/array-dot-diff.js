function array_diff(a, b) {
  return a.filter(c => !b.includes(c));
}