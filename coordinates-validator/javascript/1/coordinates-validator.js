function isValidCoordinates(coordinates) {
  var match = coordinates.match(/^(-?\d+(?:\.\d+)?), ?(-?\d+(?:\.\d+)?)$/);
  return !!match && Math.abs(parseFloat(match[1])) <= 90 && Math.abs(parseFloat(match[2])) <= 180;
}