import java.util.regex.*;

class Solution {
  static final Pattern REGEX = Pattern.compile("[_-](.)");

  static String toCamelCase(String s) {
    Matcher m = REGEX.matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      m.appendReplacement(sb, m.group(1).toUpperCase());
    }
    return m.appendTail(sb).toString();
  }
}