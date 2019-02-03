function addOrChangeUrlParameter(url, p) {
  var urlSplit = url.split('?');
  var newUrl = urlSplit[0] + '?';
  if (urlSplit.length === 1) return newUrl + p;
  var query = urlSplit[1];
  var params = query.split('&');
  var pName = p.split('=')[0];
  var match = false;
  for (var i = 0; i < params.length; i++) {
    var param = params[i];
    var paramName = param.split('=')[0];
    var same = paramName === pName;
    newUrl += (i ? '&' : '') + (same ? p : param);
    match |= same;
  }
  return newUrl + (match ? '' : '&' + p);
}