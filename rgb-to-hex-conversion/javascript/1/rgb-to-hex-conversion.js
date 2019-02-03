function rgb() {
  return Array.from(arguments).map(toHex).join('')
}

function toHex(n) {
  return Math.min(255, Math.max(0, n)).toString(16).toUpperCase().padStart(2, '0')
}