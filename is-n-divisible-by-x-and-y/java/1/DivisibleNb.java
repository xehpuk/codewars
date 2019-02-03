import static java.util.Arrays.stream;

public class DivisibleNb {
  public static boolean isDivisible(long n, long... divisors) {
    return stream(divisors).allMatch(divisor -> n % divisor == 0);
  }
}