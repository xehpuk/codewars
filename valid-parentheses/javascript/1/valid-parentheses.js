function validParentheses(parens) {
  var open = 0;
  for (var i = 0; i < parens.length; i++) {
    if (parens[i] === '(') {
      open++;
    } else if (--open < 0) {
      return false;
    }
  }
  return !open;
}