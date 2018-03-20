function validBraces(braces) {
  var validBraces = ['()', '[]', '{}'];
  var length = validBraces.length;
  var changed;
  do {
    changed = false;
    for (var i = 0; i < length; i++) {
      changed |= braces !== (braces = braces.replace(validBraces[i], ''));
    }
  } while (changed);
  return !braces.length;
}