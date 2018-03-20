function deepCompare(o1, o2) {
  if (o1 === o2) {
    return true;
  }
  if (typeof o1 !== typeof o2) {
    return false;
  }
  if (Array.isArray(o1)) {
    var length = o1.length;
    if (length !== o2.length) {
      return false;
    }
    for (var i = 0; i < length; i++) {
      if (!deepCompare(o1[i], o2[i])) {
        return false;
      }
    }
    return true;
  }
  if (typeof o1 !== 'object') {
    return false;
  }
  for (var p in o1) {
    if (!deepCompare(o1[p], o2[p])) {
      return false;
    }
  }
  for (var p in o2) {
    if (!deepCompare(o1[p], o2[p])) {
      return false;
    }
  }
  return true;
};