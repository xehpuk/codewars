public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return java.util.stream.IntStream.of(classPoints).average().getAsDouble() < yourPoints;
  }
}