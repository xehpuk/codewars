import java.util.Arrays;

public class Line {
  public static String WhoIsNext(String[] names, int n) {
    int length = names.length;
    int[] counts = new int[length];
    Arrays.fill(counts, 1);
    for (int i = 0; ; counts[i] <<= 1, i = (i + 1) % length) {
      n -= counts[i];
      if (n <= 0) {
        return names[i];
      }
    }
  }
}