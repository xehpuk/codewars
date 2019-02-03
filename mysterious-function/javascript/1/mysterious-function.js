const holes = [1, 0, 0, 0, 0, 0, 1, 0, 2, 1]

const getNum = n => {
  let sum = 0
  
  do {
    sum += holes[n % 10]
  } while (n = n / 10 | 0)
  
  return sum
}