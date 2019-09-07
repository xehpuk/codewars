function head(s) {
  return s.slice(-15)
}

function tail(s) {
  return s.slice(0, -15)
}

function add(a, b, c) {
  if (!a && !b) {
    return c || ''
  }
  
  const ah = head(a)
  const bh = head(b)
  
  const l = Math.max(ah.length, bh.length)
  
  const s = String(Number(ah) + Number(bh) + (c || 0))
  const sc = Number(s.length > l)
  
  return add(tail(a), tail(b), sc) + s.slice(sc)
}