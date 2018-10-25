class Persist {
  private static final int BASE = 10;
  
  public static int persistence(long n) {
    return persistence(n, 0);
  }
  
  private static int persistence(long n, int i) {
    return n < BASE
      ? i
      : persistence(digitProduct(n, 1), i + 1);
  }
  
  private static long digitProduct(long n, int p) {
    return n < BASE
      ? p * n
      : digitProduct(n / BASE, p * (int) (n % BASE));
  }
}