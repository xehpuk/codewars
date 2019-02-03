function dashatize(num) {
  return /[13579]/g[Symbol.replace](num, '-$&-').replace(/^-+|-$|-(?=-)/g, '')
}