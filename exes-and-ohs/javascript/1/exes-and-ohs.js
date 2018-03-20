function XO(str) {
  let c = 0
  for (let i = 0; i < str.length; i++) {
    switch(str.charAt(i)) {
      case 'O':
      case 'o':
        c++
        break
      case 'X':
      case 'x':
        c--
        break
    }
  }
  return !c
}