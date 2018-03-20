function removeZeros(array) {
  function zero(e) {
    return String(e) === '0';
  }
  
  for (var i = array.length - 1; i --> 0;) {
    var e = array[i];
    if (!zero(e)) continue;
    for (var j = i + 1; j < array.length; j++) {
      var f = array[j];
      if (zero(f)) break;
      array[j - 1] = f;
      array[j] = e;
    }
  }
  return array;
}