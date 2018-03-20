var Calculator = {
  average: function() {
    var length = arguments.length;
    if (!length) return 0;
    var sum = 0;
    for (var i = 0; i < length; i++) {
      sum += arguments[i];
    }
    return sum / length;
  }
};