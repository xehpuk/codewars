class Diamond {
  public static String print(final int n) {
    if (!positive(n) || even(n)) {
      return null;
    }
    final StringBuilder b = new StringBuilder();
    for (int i = 0; i < n; i++) {
      line(b, i, n);
    }
    return b.toString();
  }
  
  private static boolean positive(final int n) {
    return n > 0;
  }
  
  private static boolean even(final int n) {
    return n % 2 == 0;
  }
  
  private static void line(final StringBuilder b, final int i, final int n) {
    lineFeed(asterisks(spaces(b, i, n), i, n));
  }
  
  private static StringBuilder spaces(final StringBuilder b, final int i, final int n) {
    return append(b, ' ', spaces(i, n));
  }
  
  private static int spaces(final int i, final int n) {
    return Math.abs(i - n / 2);
  }
  
  private static StringBuilder asterisks(final StringBuilder b, final int i, final int n) {
    return append(b, '*', asterisks(i, n));
  }
  
  private static int asterisks(final int i, final int n) {
    return n - 2 * spaces(i, n);
  }
  
  private static StringBuilder lineFeed(final StringBuilder b) {
    return b.append('\n');
  }
  
  private static StringBuilder append(final StringBuilder b, final char c, final int times) {
    for (int i = 0; i < times; i++) {
      b.append(c);
    }
    return b;
  }
}