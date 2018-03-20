public class Keypad {
  private final static char[][] keys = {
    {'1'}, {'A', 'B', 'C', '2'}, {'D', 'E', 'F', '3'},
    {'G', 'H', 'I', '4'}, {'J', 'K', 'L', '5'}, {'M', 'N', 'O', '6'},
    {'P', 'Q', 'R', 'S', '7'}, {'T', 'U', 'V', '8'}, {'W', 'X', 'Y', 'Z', '9'},
    {'*'}, {' ', '0'}, {'#'},
  };
  
  public static int presses(final String phrase) {
    int presses = 0;
    phrase:
    for (final char letter : phrase.toCharArray()) {
      final char upperLetter = Character.toUpperCase(letter);
      for (final char[] key : keys) {
        for (int i = 0; i < key.length; i++) {
          if (upperLetter == key[i]) {
            presses += i + 1;
            continue phrase;
          }
        }
      }
    }
    return presses;
  }
}