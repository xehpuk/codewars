const a = 'a'.charCodeAt()

function scramble(str1, str2) {
  const len1 = str1.length
  const len2 = str2.length
  
  if (len1 < len2) {
    return false
  }
  
  const arr2 = Array(26).fill(0)
  for (let i = 0; i < len2; i++) {
    arr2[str2.charCodeAt(i) - a]++
  }
  
  for (let i = 0, j = len2; i < len1; i++) {
    const chr1 = str1.charCodeAt(i) - a
    const num2 = arr2[chr1]
    
    if (num2) {
      if (--j === 0) {
        return true
      }
      
      arr2[chr1] = num2 - 1
    }
  }
  
  return false
}