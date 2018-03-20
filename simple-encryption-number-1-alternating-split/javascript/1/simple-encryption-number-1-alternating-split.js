function encrypt(text, n) {
  if (!text || n <= 0) {
    return text
  }
  
  const halves = [ '', '' ]
  
  for (let i = 0; i < text.length; i++) {
    halves[i % 2] += text[i]
  }
  
  return encrypt(halves[1] + halves[0], n - 1)
}

function decrypt(text, n) {
  if (!text || n <= 0) {
    return text
  }
  
  const { length } = text
  
  let zipped = ''
  for (let i = 0, l = Math.trunc(length / 2); i < l; i++) {
    zipped += text[l + i] + text[i]
  }
  if (length % 2) {
    zipped += text[length - 1]
  }
  
  return decrypt(zipped, n - 1)
}