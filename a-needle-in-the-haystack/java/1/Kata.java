public class Kata {
  public static String findNeedle(Object[] haystack) {
    for (int i = 0;; i++) {
      if ("needle".equals(haystack[i])) {
        return "found the needle at position " + i;
      }
    }
  }
}