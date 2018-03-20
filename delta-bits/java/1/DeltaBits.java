public class DeltaBits {
  public static int convertBits(int a, int b) {
    int count = 0;
    for (int i = 0; i < Integer.SIZE; i++) {
      if (nthBit(a, i) != nthBit(b, i)) {
        count++;
      }
    }
    return count;
  }

  private static int nthBit(int i, int n) {
    return i >>> n & 1;
  }
}