function int32ToIp(int32) {
  return (int32 >>> 24 & 0xFF) + '.' +
         (int32 >>> 16 & 0xFF) + '.' +
         (int32 >>>  8 & 0xFF) + '.' +
         (int32        & 0xFF);
}