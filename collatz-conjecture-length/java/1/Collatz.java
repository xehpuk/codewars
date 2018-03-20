public class Collatz {
  public static long conjecture(long x) {
    return conjecture(x, 1);
  }
  
  private static long conjecture(long x, long length) {
    return x == 1 ? length : conjecture(x % 2 == 0 ? x / 2 : x * 3 + 1, length + 1);
  }
}