import java.util.*;

public class FindOdd {
  public static int findIt(final int[] ns) {
    final Map<Integer, Integer> nss = new HashMap<>();
    for (final int n : ns) {
      put(nss, n);
    }
    for (final Map.Entry<Integer, Integer> e : nss.entrySet()) {
      if (odd(e.getValue())) {
        return e.getKey();
      }
    }
    throw new IllegalArgumentException(Arrays.toString(ns));
  }
  
  private static void put(final Map<Integer, Integer> nss, final int n) {
    final Integer ns = nss.putIfAbsent(n, 1);
    if (ns != null) {
      nss.put(n, ns + 1);
    }
  }
  
  private static boolean odd(final int n) {
    return n % 2 == 1;
  }
}