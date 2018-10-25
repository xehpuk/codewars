class Persist {
  private static final int BASE = 10;
  
  public static int persistence(long n) {
    return persistence(n, 0);
  }
  
  private static int persistence(long n, int i) {
    return n < BASE
      ? i
      : persistence(digitProduct(n), i + 1);
  }
  
  private static long digitProduct(long n) {
    long product = 1;
    
    for (long i = n; i > 0; i /= BASE) {
      product *= i % BASE;
    }
    
    return product;
  }
}