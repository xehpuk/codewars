function high(x) {
  const { length } = x
  
  let maxWord = ''
  let maxScore = 0
  
  for (let i = 0; i < length; i++) {
    let currentWord = ''
    let currentScore = 0
    
    for (; i < length; i++) {
      const currentChar = x.charAt(i)
      
      if (currentChar === ' ') {
        break
      }
      
      currentWord += currentChar
      currentScore += currentChar.charCodeAt() - 96
    }
    
    if (currentScore > maxScore) {
      maxWord = currentWord
      maxScore = currentScore
    }
  }
  
  return maxWord
}