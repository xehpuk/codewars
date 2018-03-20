import java.util.*;

public class PerfectPower {
  public static int[] isPerfectPower(final int n) {
    final NavigableMap<Integer, Integer> primeFactors = primeFactors(n);
    final int primeFactorCount = primeFactors.size();
    if (primeFactorCount == 0) {
      return null;
    }
    if (primeFactorCount == 1) {
      final Map.Entry<Integer, Integer> primeFactor = primeFactors.firstEntry();
      final int exp = primeFactor.getValue();
      return exp > 1 ? new int[] {primeFactor.getKey(), exp} : null;
    }
    final Set<Integer> exps = new HashSet<>(primeFactors.values());
    final int expGcd = exps.stream().mapToInt(Integer::intValue).reduce(PerfectPower::gcd).getAsInt();
    if (expGcd == 1) {
      return null;
    }
    final int base = primeFactors.entrySet().stream().mapToInt(e -> (int) Math.pow(e.getKey(), e.getValue() / expGcd)).reduce(1, PerfectPower::multiply);
    return new int[] {base, expGcd};
  }
  
  private static int multiply(final int a, final int b) {
    return a * b;
  }
  
  private static int gcd(final int a, final int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  private static NavigableMap<Integer, Integer> primeFactors(int n) {
    final NavigableMap<Integer, Integer> primeFactors = new TreeMap<>();
    int divisor = 2;
    while (n > 1 && divisor * divisor <= n) {
      if (n % divisor == 0) {
        increment(primeFactors, divisor);
        n /= divisor;
      } else {
        divisor += divisor == 2 ? 1 : 2;
      }
    }
    if (n > 1) {
      increment(primeFactors, n);
    }
    return primeFactors;
  }

  private static <K> void increment(final Map<K, Integer> map, final K key) {
    final Integer exp = map.putIfAbsent(key, 1);
    if (exp != null) {
      map.put(key, exp + 1);
    }
  }
}