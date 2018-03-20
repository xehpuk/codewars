public class SquareDigit {
  private static final int BASE = 10;
  
  public int squareDigits(int n) {
    if (n < BASE) {
      return n * n;
    }
    int digit = n % BASE;
    int squaredDigit = digit * digit;
    return squaredDigit + (squaredDigit < BASE ? BASE : BASE * BASE) * squareDigits(n / BASE);
  }
}