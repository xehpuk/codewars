public class BinaryGCD {
  public static int gcdBinary(final int x, final int y) {
    return Integer.bitCount(gcd(x, y));
  }
  
  private static int gcd(final int x, final int y) {
    return y == 0 ? Math.abs(x) : gcd(y, x % y);
  }
}