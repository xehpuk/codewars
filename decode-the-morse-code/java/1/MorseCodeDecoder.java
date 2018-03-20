public class MorseCodeDecoder {
  public static final String MORSE_WORD_DELIMITER = "   ";
  public static final String MORSE_LETTER_DELIMITER = " ";
  public static final String WORD_DELIMITER = " ";
    
  public static String decode(final String morseCode) {
    final StringBuilder decodeBuilder = new StringBuilder();
    final String[] morseWords = morseCode.split(MORSE_WORD_DELIMITER);
    for (final String morseWord : morseWords) {
      if (decodeBuilder.length() > 0) {
        decodeBuilder.append(WORD_DELIMITER);
      }
      final String[] morseLetters = morseWord.split(MORSE_LETTER_DELIMITER);
      for (final String morseLetter : morseLetters) {
        final String letter = MorseCode.get(morseLetter);
        if (letter != null) { // don't know why this would be null
          decodeBuilder.append(letter);
        }
      }
    }
    return decodeBuilder.toString();
  }
}