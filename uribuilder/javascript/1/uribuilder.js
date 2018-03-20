function UriBuilder(uri) {
  this.params = {};
  
  this.build = function() {
    var build = uri;
    var keys = Object.keys(this.params);
    var length = keys.length;
    if (length) build += '?';
    for (var i = 0; i < length; i++) {
      var key = keys[i];
      var value = this.params[key];
      build += encodeURIComponent(key) + '=' + encodeURIComponent(value) + '&';
    }
    return length ? build.substr(0, build.length - 1) : build;
  }
  
  var queryIndex = uri.indexOf('?');
  if (queryIndex >= 0) {
    var query = uri.substring(queryIndex + 1);
    uri = uri.substring(0, queryIndex);
    var pairs = query.split('&');
    for (var i = 0; i < pairs.length; i++) {
      var pair = pairs[i];
      var separatorIndex = pair.indexOf('=');
      if (separatorIndex >= 0) {
        var key = pair.substring(0, separatorIndex);
        var value = pair.substring(separatorIndex + 1)
        this.params[key] = value;
      }
    }
  }
}