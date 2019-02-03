function hexStringToRGB(hexString) {
  function parse(i) {
    return parseInt(hexString.substr(i, 2), 16)
  }
  
  return {
    r: parse(1),
    g: parse(3),
    b: parse(5)
  }
}