function checkDigit(n, i1, i2, d) {
  const { log10, min, max, pow, floor } = Math
  const c = log10(n) | 0
  const i = min(i1, i2)
  const j = max(i1, i2)
  const l = n % pow(10, c - i + 1)
  const r = floor(l / pow(10, c - j))
  const f = n => n < 10
                   ? n === d
                   : n % 10 === d || f(floor(n / 10))
  return f(r)
}