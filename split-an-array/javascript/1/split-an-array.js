function split(arr, prop) {
  var split = [[], []];
  for (var i = 0; i < arr.length; i++) {
    var object = arr[i];
    split[Number(!object[prop])].push(object);
  }
  return split;
}