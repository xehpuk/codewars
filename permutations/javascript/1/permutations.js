function permutations(string) {
  if (string.length <= 1) {
    return [string];
  }
  var perms = [];
  for (var i = 0; i < string.length; i++) {
    perms = perms.concat(permutations(string.substring(0, i) + string.substring(i + 1)).map(function(e) {
      return string[i] + e;
    }).filter(function(e) {
      return perms.indexOf(e) === -1;
    }));
  }
  return perms;
}