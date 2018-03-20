import java.util.*;

public class PrimeFactorizer {
  public Map<Long, Integer> factor(long n) {
    final Map<Long, Integer> factors = new HashMap<>();
    long divisor = 2;
    while (n > 1 && divisor * divisor <= n) {
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
      final Integer exp = factors.putIfAbsent(n, 1);
      if (exp != null) {
        factors.put(n, exp + 1);
      }
    }
    return factors;
  }
}