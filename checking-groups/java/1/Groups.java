import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Groups {
  public static boolean groupCheck(final String s) {
    final int length = s.length();
    final Deque<Character> openings = new LinkedBlockingDeque<>(length / 2);
    for (int i = 0; i < length; i++) {
      if (!groupCheck(openings, s.charAt(i))) {
        return false;
      }
    }
    return openings.isEmpty();
  }
  
  private static boolean groupCheck(final Deque<Character> openings, final char c) {
    for (final Group group : Group.values()) {
      if (group.opening == c) {
        return openings.offerFirst(c);
      }
      if (group.closing == c) {
        final Character bracket = openings.pollFirst();
        return bracket != null && group.opening == bracket;
      }
    }
    return true;
  }
}

enum Group {
  PARENTHESES('(', ')'),
  BRACKETS('[', ']'),
  BRACES('{', '}');

  final char opening;
  final char closing;

  Group(final char opening, final char closing) {
    this.opening = opening;
    this.closing = closing;
  }
}