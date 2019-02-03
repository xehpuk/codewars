function firstNonRepeatingLetter(s) {
  const letters = Array.from(s).reduce((letters, letter) => {
    const lowerCaseLetter = letter.toLowerCase()
    if (lowerCaseLetter in letters) {
      return {
        ...letters,
        [lowerCaseLetter]: letters[lowerCaseLetter] + 1
      }
    }
    
    const upperCaseLetter = letter.toUpperCase()
    if (upperCaseLetter in letters) {
      return {
        ...letters,
        [upperCaseLetter]: letters[upperCaseLetter] + 1
      }
    }
    
    return {
      ...letters,
      [letter]: 0
    }
  }, {})
  
  return Object.keys(letters).find(letter => !letters[letter]) || ''
}