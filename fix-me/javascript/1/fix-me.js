function fixMe() {
  var numbers = new Array(10);
  for (var i = 0; i < 10; i++) {
    numbers[i] = fix(i);
  }
  return numbers;
}

function fix(i) {
  return function() {
    return i;
  };
}