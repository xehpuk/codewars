const opposites = {
  NORTH: "SOUTH",
  SOUTH: "NORTH",
  EAST: "WEST",
  WEST: "EAST"
}

function dirReduc(arr) {
  for (let i = 0; i < arr.length - 1; i++) {
    let first = arr[i], second = arr[i + 1];
    if (opposites[first] === second) {
      arr.splice(i, 2);
      i = Math.max(i - 2, -1);
    }
  }
  return arr;
}