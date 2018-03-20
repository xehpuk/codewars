import java.util.*;

public class PrimeFactorizer {
  public Map<Long, Integer> factor(long n) {
    final Map<Long, Integer> factors = new HashMap<>();
    long divisor = 2;
    while (n > 1 && divisor * divisor <= n) {
      if (n % divisor == 0) {
        put(factors, divisor);
        n /= divisor;
      } else {
        divisor += divisor == 2 ? 2 : 1;
      }
    }
    if (n > 1) {
      put(factors, n);
    }
    return factors;
  }
  
  private void put(final Map<Long, Integer> factors, final long factor) {
    final Integer exp = factors.putIfAbsent(factor, 1);
    if (exp != null) {
      factors.put(factor, exp + 1);
    }
  }
}