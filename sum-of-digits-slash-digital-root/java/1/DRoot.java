public class DRoot {
  /**
   * @deprecated Violation of the Java code conventions. Use {@link #digitalRoot(int)} instead.
   */
  @Deprecated
  public static int digital_root(int n) {
    return digitalRoot(n);
  }
  
  public static int digitalRoot(final int n) {
    int root;
    for (root = digitSum(n); root >= 10; root = digitSum(root));
    return root;
  }
  
  private static int digitSum(final int n) {
    int sum = 0;
    for (int m = n; m > 0; sum += m % 10, m /= 10);
    return sum;
  }
}