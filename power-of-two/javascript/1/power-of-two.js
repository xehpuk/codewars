function isPowerOfTwo(n) {
  return n & 1 === 1 ? n === 1 : isPowerOfTwo(n >> 1);
}