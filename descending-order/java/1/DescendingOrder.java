public class DescendingOrder {
  private static final int BASE = 10;
  
  public static int sortDesc(final int n) {
    return sortDesc(n, 0);
  }
  
  private static int sortDesc(final int n, final int desc) {
    return isPositive(n) ? sortDesc(shiftRight(n), insertDesc(desc, lastDigit(n)))
                         : desc;
  }
  
  private static int insertDesc(final int n, final int m) {
    if (isDigit(n)) {
      return !isPositive(n) ? m
                            : m > n ? shiftLeft(m) + n
                                    : shiftLeft(n) + m;
    }
    final int d = lastDigit(n);
    return d >= m ? shiftLeft(n) + m
                  : shiftLeft(insertDesc(shiftRight(n), m)) + d;
  }
  
  private static boolean isPositive(final int n) {
    return n > 0;
  }
  
  private static boolean isDigit(final int n) {
    return n < BASE;
  }
  
  private static int lastDigit(final int n) {
    return n % BASE;
  }
  
  private static int shiftRight(final int n) {
    return n / BASE;
  }
  
  private static int shiftLeft(final int n) {
    return n * BASE;
  }
}