function pluck(objs, name) {
  var length = objs.length;
  var pluck = new Array(length);
  for (var i = 0; i < length; i++) {
    pluck[i] = objs[i][name];
  }
  return pluck;
}