import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class PrimeNumberDecomposer {
  public static Long[] getAllPrimeFactors(final long n) {
    List<Long> factors = new ArrayList<>();
    for (final Map.Entry<Long, Long> entry : factorize(n).entrySet()) {
      for (long i = 0, m = entry.getValue(), f = entry.getKey(); i < m; i++) {
        factors.add(f);
      }
    }
    return factors.toArray(new Long[factors.size()]);
  }

  public static Long[][] getUniquePrimeFactorsWithCount(final long n) {
    final Map<Long, Long> factors = factorize(n);
    final Long[] primes = factors.keySet().toArray(new Long[0]);
    final Long[] exponents = factors.values().toArray(new Long[0]);
    return new Long[][]{primes, exponents};
  }

  public static Long[] getPrimeFactorPotencies(final long n) {
    return factorize(n).entrySet().stream().map(e -> (long) Math.pow(e.getKey(), e.getValue())).toArray(Long[]::new);
  }

  private static Map<Long, Long> factorize(long n) {
    final Map<Long, Long> factors = new LinkedHashMap<>();
    long divisor = 2;
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

  private static void put(final Map<Long, Long> factors, final long factor) {
    final Long exponent = factors.putIfAbsent(factor, 1L);
    if (exponent != null) {
      factors.put(factor, exponent + 1);
    }
  }
}