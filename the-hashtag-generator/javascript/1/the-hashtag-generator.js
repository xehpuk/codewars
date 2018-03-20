function generateHashtag(str) {
  if (!str.length) return false;
  var hash = '#' + str.trim().split(' ').map(function(word) {
    return word[0].toUpperCase() + word.substring(1);
  }).join('');
  return hash.length > 140 ? false : hash;
}