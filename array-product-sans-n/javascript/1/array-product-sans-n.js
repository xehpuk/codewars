const BigNumber = require("bignumber.js")

function productSansN(numbers) {
  let product = new BigNumber(1)
  let zero = -1
  for (let i = 0; i < numbers.length; i++) {
    const n = numbers[i]
    if (n === 0) {
      if (zero >= 0) {
        return numbers.fill('0')
      }
      zero = i
    } else {
      product = product.times(n)
    }
  }
  if (zero >= 0) {
    numbers.fill('0')
    numbers[zero] = product.toFixed(0)
    return numbers
  }
  for (let i = 0; i < numbers.length; i++) {
    numbers[i] = product.div(numbers[i]).toFixed(0)
  }
  return numbers;
}