import java.util.Arrays;

public class AnagramChecker {
  public static boolean isAnagram(String first, String second) {
    if (first == null || second == null) {
      return false;
    }
    char[] firstChars = first.toCharArray();
    char[] secondChars = second.toCharArray();
    Arrays.sort(firstChars);
    Arrays.sort(secondChars);
    return Arrays.equals(firstChars, secondChars);
  }
}