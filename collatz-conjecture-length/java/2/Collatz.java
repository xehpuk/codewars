public class Collatz {
  public static long conjecture(long x) {
    return 1 + (x == 1 ? 0 : conjecture(x % 2 == 0 ? x / 2 : x * 3 + 1));
  }
}