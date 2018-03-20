function accum(s) {
  return Array.from(s).map((c, i) => c.toUpperCase() + c.toLowerCase().repeat(i)).join('-');
}