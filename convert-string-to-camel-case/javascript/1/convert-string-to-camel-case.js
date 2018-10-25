function toCamelCase(str) {
  return str.replace(/[_-]([a-z])/ig, (_, c) => c.toUpperCase())
}