function feast(beast, dish) {
  const [b1, b2] = firstAndLast(beast)
  const [d1, d2] = firstAndLast(dish)
  return b1 === d1 && b2 === d2
}

function firstAndLast(s) {
  return s.split(/(?<=.).*(?=.)/)
}