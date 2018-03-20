import java.util.LinkedHashMap;
import java.util.Map;

public class PrimeDecomp {
  public static String factors(final int n) {
    final StringBuilder builder = new StringBuilder();
    for (final Map.Entry<Integer, Integer> factor : factorize(n).entrySet()) {
      builder.append('(').append(factor.getKey());
      final Integer exponent = factor.getValue();
      if (exponent > 1) {
        builder.append("**").append(exponent);
      }
      builder.append(')');
    }
    return builder.toString();
  }

  public static Map<Integer, Integer> factorize(int n) {
    final Map<Integer, Integer> factors = new LinkedHashMap<>();
    int divisor = 2;
    while (n > 1 && divisor * divisor <= n) {
      if (n % divisor == 0) {
        put(factors, divisor);
        n /= divisor;
      } else {
        divisor += divisor == 2 ? 1 : 2;
      }
    }
    if (n > 1) {
      put(factors, n);
    }
    return factors;
  }

  private static void put(final Map<Integer, Integer> factors, final int factor) {
    final Integer exp = factors.putIfAbsent(factor, 1);
    if (exp != null) {
      factors.put(factor, exp + 1);
    }
  }
}