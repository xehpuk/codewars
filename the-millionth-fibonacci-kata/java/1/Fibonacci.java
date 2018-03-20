import java.math.BigInteger;

public class Fibonacci {
  public static BigInteger fib(final BigInteger n) {
    final int m = n.intValueExact();
    final int absM = Math.abs(m);
    BigInteger lastFibonacci = BigInteger.ZERO;
    BigInteger fibonacci = BigInteger.ONE;
    for (int i = Integer.SIZE - Integer.numberOfLeadingZeros(absM) - 1; i >= 0; i--) {
      {
        final BigInteger newLastFibonacci = lastFibonacci.multiply(fibonacci.shiftLeft(1).subtract(lastFibonacci));
        final BigInteger newFibonacci = lastFibonacci.multiply(lastFibonacci).add(fibonacci.multiply(fibonacci));
        lastFibonacci = newLastFibonacci;
        fibonacci = newFibonacci;
      }

      if ((absM >>> i) % 2 != 0) {
        final BigInteger newFibonacci = lastFibonacci.add(fibonacci);
        lastFibonacci = fibonacci;
        fibonacci = newFibonacci;
      }
    }
    return m < 0 && m % 2 == 0 ? lastFibonacci.negate() : lastFibonacci;
  }
}