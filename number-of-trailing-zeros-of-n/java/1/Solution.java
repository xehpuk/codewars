public class Solution {
  private static final int P = 5;
  
  // De Polignac's formula
  public static int zeros(final int n) {
    int zeros = 0;
    for (int i = 1, k = k(n), p = P; i <= k; i++, p *= P) {
      zeros += n / p;
    }
    return zeros;
  }
  
  // P^(k+1) > n
  private static int k(final int n) {
    return (int) (Math.log(n) / Math.log(P));
  }
}