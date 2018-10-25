function expandedForm(num, pos = 1) {
  if (num < 10) {
      return String(num * pos)
  }
  const remainder = expandedForm(Math.trunc(num / 10), 10 * pos)
  const digit = num % 10
  return digit
   ? `${remainder} + ${expandedForm(digit, pos)}`
   : remainder
}