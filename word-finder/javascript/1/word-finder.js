function Dictionary(words) {
  this.words = words;
  
  this.getMatchingWords = function(pattern) {
    var regex = new RegExp('^' + pattern.replace(/\?/g, '.') + '$');
    return this.words.filter(function(word) {
      return regex.test(word);
    });
  }
}