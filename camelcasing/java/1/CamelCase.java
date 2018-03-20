import static java.lang.Character.*;

public class CamelCase {
  public static String cAmEl(final String yourName) {
    final int length = yourName.length();
    final StringBuilder cAmEl = new StringBuilder(length);
    boolean upper = true;
    for (int i = 0; i < length; i++, upper ^= true) {
      final char c = yourName.charAt(i);
      cAmEl.append(upper ? toUpperCase(c) : toLowerCase(c));
    }
    return cAmEl.toString();
  }
}