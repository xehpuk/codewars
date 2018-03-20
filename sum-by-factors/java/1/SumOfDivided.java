import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SumOfDivided {
  public static String sumOfDivided(final int[] ns) {
    final Set<Integer> factors = new TreeSet<>();
    for (final int n : ns) {
      factors.addAll(factorize(n));
    }
    return factors.stream().map(factor -> "(" + factor + " " + Arrays.stream(ns).filter(n -> n % factor == 0).sum() + ")").collect(Collectors.joining());
  }

  public static Set<Integer> factorize(int n) {
    final Set<Integer> factors = new HashSet<>();
    int divisor = 2;
    while (n > 1 && divisor * divisor <= n) {
      if (n % divisor == 0) {
        factors.add(divisor);
        n /= divisor;
      } else {
        divisor += divisor == 2 ? 1 : 2;
      }
    }
    if (n > 1) {
      factors.add(n);
    }
    return factors;
  }
}