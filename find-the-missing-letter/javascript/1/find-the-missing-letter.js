function findMissingLetter(array) {
  for (let i = 1;; i++) {
    const c = array[i].charCodeAt() - 1
    if (array[i - 1].charCodeAt() < c) {
      return String.fromCharCode(c)
    }
  }
}