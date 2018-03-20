function HTMLGen() {
  function tag(e, inner) {
    return '<' + e + '>' + inner + '</' + e + '>';
  }
  
  ['a', 'b', 'p', 'body', 'div', 'span', 'title'].forEach(function(e) {
    this[e] = function(inner) {
      return tag(e, inner);
    };
  }, this);
  
  this.comment = function(inner) {
    return '<!--' + inner + '-->';
  }
}