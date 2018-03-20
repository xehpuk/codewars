function length(n) {
  return n === 0
    ? 1
    : Math.trunc(Math.log10(n)) + 1
}

function digitAt(n, i) {
  return Math.trunc(n / 10 ** i) % 10
}

function binarySearch(n, key) {
  let low = 0
  let high = length(n) - 1

  while (low <= high) {
    const mid = (low + high) >>> 1
    const midVal = digitAt(n, mid)

    if (midVal < key) {
      low = mid + 1
    } else if (midVal > key) {
      high = mid - 1
    } else {
      return mid
    }
  }

  return low
}

function insertDigitAt(n, d, i) {
  const factor = 10 ** i
  return 10 * Math.trunc(n / factor) * factor + factor * d + n % factor
}

function insertDigit(n, d) {
  return insertDigitAt(n, d, binarySearch(n, d))
}

function descendingOrder(n) {
  function desc(n, o) {
    return n === 0
      ? o % 10 ** (length(o) - 1)
      : desc(Math.trunc(n / 10), insertDigit(o, n % 10))
  }

  return desc(n, 9)
}