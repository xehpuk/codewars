public class SequenceSum {
  public static int[] sumOfN(int n) {
    Integer signum = Integer.signum(n);
    int[] sumOfN = new int[signum * n + 1];
    for (int i = 1; i < sumOfN.length; i++) {
      sumOfN[i] = sumOfN[i - 1] + signum * i;
    }
    return sumOfN;
  }
}