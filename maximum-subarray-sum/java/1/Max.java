public class Max {
  public static int sequence(final int[] seq) {
    int max = 0;
    for (int i = 0, c = 0; i < seq.length; i++) {
      c += seq[i];
      c = Math.max(c, 0);
      max = Math.max(max, c);
    }
    return max;
  }
}