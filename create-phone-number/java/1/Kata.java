public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    return createPhoneNumber(box(numbers));
  }
  
  private static String createPhoneNumber(Integer[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers);
  }
  
  private static Integer[] box(int[] numbers) {
    return java.util.stream.IntStream.of(numbers).boxed().toArray(Integer[]::new);
  }
}