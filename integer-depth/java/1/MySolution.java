import java.util.BitSet;

public class MySolution {
  private static final int BASE = 10;
  
  public static int computeDepth(int n) {
    int i = 1;
    
    for (BitSet digits = new BitSet(BASE); digits.cardinality() < BASE; i++) {
      for (int j = i * n; j > 0; j /= BASE) {
        digits.set(j % BASE);
      }
    }
    
    return i - 1;
  }
}