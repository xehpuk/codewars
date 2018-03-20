import java.util.regex.*;

public class Abbreviator {
  public String abbreviate(String s) {
    Pattern p = Pattern.compile("[a-z]{4,}", Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
      String g = m.group();
      int l = g.length();
      m.appendReplacement(sb, g.substring(0, 1) + (l - 2) + g.substring(l - 1, l));
    }
    m.appendTail(sb);
    return sb.toString();
  }
}