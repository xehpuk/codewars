function listSquared(m, n) {
  const result = []
  
  for (let i = m; i <= n; i++) {
    const sum = getDivisorsSquareSum(i)
    if (isSquare(sum)) {
      result.push([i, sum])
    }
  }
  
  return result;
}

function getDivisorsSquareSum(m) {
  return getDivisors(m).reduce((sum, divisor) => sum + divisor * divisor, 0)
}

function getDivisors(m) {
  if (m === 1) {
    return [1]
  }

  const divisors = [1]
  
  for (let d = 2, n = m / d | 0; d <= n; d++) {
    if (m % d === 0) {
      divisors.push(d)
    }
  }
  
  return divisors.concat(m)
}

function isSquare(m) {
  const sqrt = Math.sqrt(m) | 0
  return sqrt * sqrt === m
}