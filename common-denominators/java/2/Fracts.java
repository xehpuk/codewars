import static java.util.Arrays.stream;

public class Fracts {
  public static String convertFrac(final long[][] lst) {
    final long commonDenominator = stream(lst).mapToLong(fract -> fract[1]).reduce(1, Fracts::lcm);
    final StringBuilder builder = new StringBuilder();
    stream(lst).mapToLong(fract -> fract[0] * commonDenominator / fract[1]).forEach(numerator -> builder.append('(').append(numerator).append(',').append(commonDenominator).append(')'));
    return builder.toString();
  }

  private static long lcm(final long a, final long b) {
    return a * (b / gcd(a, b));
  }
  
  private static long gcd(final long a, final long b) {
    return b == 0 ? a : gcd(b, a % b);
  }
}