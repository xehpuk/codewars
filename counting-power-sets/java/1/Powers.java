import java.math.BigInteger;

public class Powers {
  public static BigInteger powers(int[] list) {
    return BigInteger.valueOf(2).pow(list.length);
  }
}