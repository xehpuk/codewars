import java.util.Arrays;

public class SpinWords {
  public static final String WORD_DELIMITER = " ";
  
  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(WORD_DELIMITER, -1)).map(SpinWords::spinIfNecessary).reduce((w1, w2) -> w1 + WORD_DELIMITER + w2).get();
  }

  private static String spinIfNecessary(String word) {
    return spinnable(word) ? spin(word) : word;
  }

  private static boolean spinnable(String word) {
    return word.length() >= 5;
  }

  private static String spin(String word) {
    return new StringBuilder(word).reverse().toString();
  }
}