public class Positive{
  public static int sum(int[] arr) {
    return java.util.Arrays.stream(arr)
      .filter(n -> n > 0)
      .sum();
  }
}