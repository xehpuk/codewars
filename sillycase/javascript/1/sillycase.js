function sillycase(silly) {
  var half = Math.round(silly.length / 2);
  return silly.substring(0, half).toLowerCase() + silly.substring(half).toUpperCase()
}