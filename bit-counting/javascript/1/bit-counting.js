const countBits = n =>
  n === 0
    ? 0
    : (n & 1) + countBits(n >> 1)