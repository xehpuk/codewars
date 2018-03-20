function convertBits(a, b) {
  let c = 0;
  for (let d = a ^ b, e = 0, f = Math.log2(d); e <= f; e++) {
    c += (d >> e) & 1;
  }
  return c;
}