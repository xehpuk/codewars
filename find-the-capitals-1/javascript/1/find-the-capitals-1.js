var capitals = function(word) {
  var capitals = [];
  for (var i = 0, l = word.length; i < l; i++) {
    var c = word[i];
    if (c !== c.toLowerCase()) {
      capitals.push(i);
    }
  }
  return capitals;
};