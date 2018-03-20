import java.util.regex.*;

public class Vowels {

  public static int getCount(String str) {
    Pattern vowels = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
    Matcher vowelMatcher = vowels.matcher(str);
    int vowelCount;
    for (vowelCount = 0; vowelMatcher.find(); vowelCount++);
    return vowelCount;
  }

}