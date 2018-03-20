public class PalindromChecker {
  public boolean isPalindrome(String str) {
    if (str == null) {
        return false;
    }
    String sanitized = str.replaceAll("\\W", "");
    return sanitized.equalsIgnoreCase(new StringBuilder(sanitized).reverse().toString());
  }
}