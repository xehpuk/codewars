Math.round = function(number) {
  return Math.floor(number + .5);
};

Math.ceil = function(number) {
  var floor = Math.floor(number);
  return floor === number ? number : floor + 1;
};

Math.floor = function(number) {
  return ~~number;
};