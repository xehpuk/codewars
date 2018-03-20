function abbreviate(string) {
  return string.replace(/[a-z]+/gi, function(word) {
    var length = word.length;
    return length < 4 ? word : word[0] + (length - 2) + word[length - 1];
  });
}