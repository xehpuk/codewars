import java.util.HashMap;
import java.util.Map;
import java.util.function.IntBinaryOperator;

public class BinaryCalculator {
  public static final int RADIX = 2;
  
  private static final Map<String, IntBinaryOperator> OPS = new HashMap<>();
  
  static {
    OPS.put("add", (a, b) -> a + b);
    OPS.put("subtract", (a, b) -> a - b);
    OPS.put("multiply", (a, b) -> a * b);
  }
  
  public static String calculate(final String n1, final String n2, final String o) {
    return toBinary(OPS.get(o).applyAsInt(fromBinary(n1), fromBinary(n2)));
  }
  
  private static int fromBinary(final String s) {
    return Integer.parseInt(s, RADIX);
  }
  
  private static String toBinary(final int n) {
    return Integer.toString(n, RADIX);
  }
}