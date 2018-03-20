function find(needle, haystack) {
  for (let i = 0, nl = needle.length, hl = haystack.length, max = hl - nl; i <= max; i++) {
    if (f(needle, haystack, i)) {
      return i;
    }
  }
  return -1;
}

function f(needle, haystack, i) {
  for (let j = 0, nl = needle.length; j < nl; j++) {
    let n = needle[j];
    if (n !== '_' && n !== haystack[i + j]) {
      return false;
    }
  }
  return true;
}