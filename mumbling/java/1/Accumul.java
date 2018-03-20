public class Accumul {
  public static String accum(String s) {
    int l = s.length();
    if (l == 0) {
      return s;
    }
    StringBuilder sb = new StringBuilder(l * (l + 1) / 2 + l - 1);
    sb.append(s.charAt(0));
    for (int i = 1; i < l; i++) {
      char c = s.charAt(i);
      sb.append('-');
      sb.append(Character.toUpperCase(c));
      char lc = Character.toLowerCase(c);
      for (int j = 0; j < i; j++) {
        sb.append(lc);
      }
    }
    return sb.toString();
  }
}