import java.util.stream.IntStream;

public class Primes {
  private static final int[] primes = new int[1_000_000 + 10];
  private static int last = 1;
  private static int i;

  static {
    primes[0] = 2;
    primes[1] = 3;
  }

  public static IntStream stream() {
    i = 0;
    return IntStream.generate(() -> {
      if (i <= last) {
        return primes[i++];
      }
      int candidate;
      for (candidate = primes[i++ - 1] + 2; !prime(candidate); candidate += 2);
      return primes[++last] = candidate;
    });
  }

  private static boolean prime(final int n) {
    for (final int prime : primes) {
      if (prime * prime > n) {
        return true;
      }
      if (n % prime == 0) {
        return false;
      }
    }
    return true;
  }
}