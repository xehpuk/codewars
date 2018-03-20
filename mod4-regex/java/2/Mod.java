import java.util.regex.Pattern;

public class Mod {
  public static Pattern mod4 = Pattern.compile("\\[[+-]?([048]|\\d*([02468][048]|[13579][26]))]");
}