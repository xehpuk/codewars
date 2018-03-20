function isCircleSorted(arr) {
  let jumped = false;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > arr[(i + 1) % arr.length]) {
      if (jumped) {
        return false;
      }
      jumped = true;
    }
  }
  return true;
}