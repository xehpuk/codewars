public class Fraction {
  private static int lcm(final int a, final int b) {
    return a * (b / gcd(a, b));
  }
  
  private static int gcd(final int a, final int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
  
  private final int numerator;
  private final int denominator;
  private final double decimal;

  public Fraction(int numerator, int denominator) {
    int gcd = Math.abs(gcd(numerator, denominator));
    int sigDenom = Integer.signum(denominator);
    this.numerator = numerator / gcd * sigDenom;
    this.denominator = denominator / gcd * sigDenom;
    decimal = (double) numerator / denominator;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    boolean negative = numerator < 0;
    if (negative) {
      builder.append('-');
    }
    int num = negative ? -numerator : numerator;
    int quotient = num / denominator;
    if (quotient > 0) {
      builder.append(quotient);
      int rem = num - denominator * quotient;
      if (rem > 0) {
        builder.append(' ').append(rem).append('/').append(denominator);
      }
    } else {
      builder.append(num).append('/').append(denominator);
    }
    return builder.toString();
  }

  public double toDecimal() {
    return decimal;
  }

  public Fraction add(int value) {
    return new Fraction(numerator + value * denominator, denominator);
  }

  public Fraction add(Fraction value) {
    int lcm = lcm(denominator, value.denominator);
    return new Fraction(numerator * lcm / denominator + value.numerator * lcm / value.denominator, lcm);
  }

  public Fraction substract(int value) {
    return new Fraction(numerator - value * denominator, denominator);
  }

  public Fraction substract(Fraction value) {
    int lcm = lcm(denominator, value.denominator);
    return new Fraction(numerator * lcm / denominator - value.numerator * lcm / value.denominator, lcm);
  }

  public Fraction multiply(int value) {
    return new Fraction(numerator * value, denominator);
  }

  public Fraction multiply(Fraction value) {
    return new Fraction(numerator * value.numerator, denominator * value.denominator);
  }

  public Fraction divide(int value) {
    return new Fraction(numerator, denominator * value);
  }

  public Fraction divide(Fraction value) {
    return new Fraction(numerator * value.denominator, denominator * value.numerator);
  }
}