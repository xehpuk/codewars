function number(n, f) {
  return f ? f(n) : n
}
function zero(f) {
  return number(0, f)
}
function one(f) {
  return number(1, f)
}
function two(f) {
  return number(2, f)
}
function three(f) {
  return number(3, f)
}
function four(f) {
  return number(4, f)
}
function five(f) {
  return number(5, f)
}
function six(f) {
  return number(6, f)
}
function seven(f) {
  return number(7, f)
}
function eight(f) {
  return number(8, f)
}
function nine(f) {
  return number(9, f)
}

function plus(b) {
  return function (a) {
    return a + b
  }
}
function minus(b) {
  return function (a) {
    return a - b
  }
}
function times(b) {
  return function (a) {
    return a * b
  }
}
function dividedBy(b) {
  return function (a) {
    return Math.trunc(a / b)
  }
}