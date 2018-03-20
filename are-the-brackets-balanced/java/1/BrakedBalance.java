import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class BrakedBalance {
  private static final char CLOSING = ')';
  private static final char OPENING = '(';
  
  public static boolean isStringBalanced(final String s) {
    final int length = s.length();
    final Deque<Character> openings = new LinkedBlockingDeque<>(length / 2);
    for (int i = 0; i < length; i++) {
      if (!isCharBalanced(openings, s.charAt(i))) {
        return false;
      }
    }
    return openings.isEmpty();
  }
  
  private static boolean isCharBalanced(final Deque<Character> openings, final char c) {
    if (c == OPENING) {
      return openings.offerFirst(c);
    }
    if (c == CLOSING) {
      final Character bracket = openings.pollFirst();
      return bracket != null && bracket == OPENING;
    }
    return false;
  }
}