function firstNonRepeatingLetter(s) {
  const letters = Array.from(s).reduce((letters, letter) => {
    const lowerCaseLetter = letter.toLowerCase()
    if (letters.has(lowerCaseLetter)) {
      return letters.set(lowerCaseLetter, false)
    }
    
    const upperCaseLetter = letter.toUpperCase()
    if (letters.has(upperCaseLetter)) {
      return letters.set(upperCaseLetter, false)
    }
    
    return letters.set(letter, true)
  }, new Map())
  
  const iterator = letters.entries()
  let letter
  while (!(letter = iterator.next()).done) {
    const { value } = letter
    if (value[1]) {
      return value[0]
    }
  }
  
  return ''
}