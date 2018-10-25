import java.util.regex.*;

public class Kata {
  private static final Pattern REGEX = Pattern.compile("\\d");
  private static final Matcher MATCHER = REGEX.matcher("(123) 456-7890");
  
  public static String createPhoneNumber(int[] numbers) {
    StringBuffer sb = new StringBuffer();
    MATCHER.reset();
    for (int i = 0; MATCHER.find(); i++) {
      MATCHER.appendReplacement(sb, Integer.toString(numbers[i]));
    }
    return MATCHER.appendTail(sb).toString();
  }
}