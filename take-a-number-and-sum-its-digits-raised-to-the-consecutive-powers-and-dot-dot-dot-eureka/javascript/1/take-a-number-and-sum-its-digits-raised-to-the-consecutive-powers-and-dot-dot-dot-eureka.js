function sumDigPow(a, b) {
  const eureka = []
  
  for (let i = a; i <= b; i++) {    
    if (isEureka(i)) {
      eureka.push(i)
    }
  }
  
  return eureka
}

function isEureka(n) {
  let sum = 0
  const digits = toDigitArray(n)
  
  for (let i = 0; i < digits.length; i++) {
    const digit = digits[i]
    
    sum += digit ** (i + 1)
  }
  
  return sum === n
}

function toDigitArray(n) {
  const digits = []
  
  for (let i = n; i > 0; i = i / 10 | 0) {
    digits.unshift(i % 10)
  }
  
  return digits
}