import java.util.regex.*;

public class Kata {
  private static final Pattern REGEX = Pattern.compile("_");
  private static final Matcher MATCHER = REGEX.matcher("(___) ___-____");
  
  public static String createPhoneNumber(int[] numbers) {
    StringBuffer sb = new StringBuffer();
    MATCHER.reset();
    for (int i = 0; MATCHER.find(); i++) {
      MATCHER.appendReplacement(sb, Integer.toString(numbers[i]));
    }
    return MATCHER.appendTail(sb).toString();
  }
}