public class Sequence {
  public static int nthterm(int first, int n, int c) {
    int nthterm = first;
    for (int i = 0; i < n; nthterm += c, i++);
    return nthterm;
  }
}