import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
  public static final String WORD_DELIMITER = " ";
  
  public String spinWords(String sentence) {
    return Arrays.stream(sentence.split(WORD_DELIMITER, -1)).map(SpinWords::spinIfNecessary).collect(Collectors.joining(WORD_DELIMITER));
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