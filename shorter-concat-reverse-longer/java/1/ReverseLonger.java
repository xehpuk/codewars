public class ReverseLonger {
  public static String shorterReverseLonger(final String a, final String b) {
    final String shorter;
    final String longer;
    if (a.length() < b.length()) {
      shorter = a;
      longer = b;
    } else {
      shorter = b;
      longer = a;
    }
    return shorter + new StringBuilder(longer).reverse() + shorter;
  }
}