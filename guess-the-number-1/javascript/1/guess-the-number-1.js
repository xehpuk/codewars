Guesser.prototype.getNumber = function() {
  let min = 0, max = 1000, n;
  while (true) {
    n = Math.trunc((min + max) / 2);
    switch (this.guess(n)) {
      case "Too high!":
        max = n - 1;
        break;
      case "Too low!":
        min = n + 1;
        break;
      case "Correct!":
        return n;
    }
  }
}