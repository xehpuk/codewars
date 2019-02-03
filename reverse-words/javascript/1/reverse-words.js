function reverseWords(str) {
  return str.replace(/\S+/g, w => Array.from(w).reverse().join(''))
}