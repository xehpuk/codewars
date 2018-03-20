import java.util.function.IntUnaryOperator;

public class AdderFactory {
  public static IntUnaryOperator create(int j) {
    return i -> i + j;
  }
}