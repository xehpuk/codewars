function pigIt(str) {
  return str.replace(/\w+/g, match => `${match.substr(1)}${match.charAt(0)}ay`)
}