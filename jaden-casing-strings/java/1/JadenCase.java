public class JadenCase {
  public String toJadenCase(final String phrase) {
    if (phrase == null || phrase.isEmpty()) {
      return null;
    }
    final int length = phrase.length();
    final StringBuilder jadenBuilder = new StringBuilder(length);
    boolean newWord = true;
    for (int i = 0; i < length; i++) {
      char c = phrase.charAt(i);
      if (Character.isWhitespace(c)) {
        newWord = true;
      } else if (newWord) {
        c = Character.toUpperCase(c);
        newWord = false;
      } else {
        newWord = false;
      }
      jadenBuilder.append(c);
    }
    return jadenBuilder.toString();
  }
}