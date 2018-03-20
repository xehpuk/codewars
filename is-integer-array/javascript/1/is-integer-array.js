function isIntArray(a) {
  if (!Array.isArray(a)) {
    return false;
  }
  for (var i = 0, l = a.length; i < l; i++) {
    var n = a[i];
    if (n !== ~~n) {
      return false;
    }
  }
  return true;
}