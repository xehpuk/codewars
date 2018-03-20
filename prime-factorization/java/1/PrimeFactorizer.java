import java.util.*;

public class PrimeFactorizer {
  public Map<Long, Integer> factor(long n) {
    final Map<Long, Integer> factors = new HashMap<>();
    final long max = (long) Math.sqrt(n);
    long divisor = 2;
    while (n > 1 && divisor <= max) {
      if (n % divisor == 0) {
        final Integer exp = factors.putIfAbsent(divisor, 1);
        if (exp != null) {
          factors.put(divisor, exp + 1);
        }
        n /= divisor;
      } else {
        divisor += divisor == 2 ? 2 : 1;
      }
    }
    if (n > 1) {
      factors.put(n, 1);
    }
    return factors;
  }
}