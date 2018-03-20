public class Morpheus {
  public int[] find(Matrix matrix, int neo) {
    int size = matrix.size();
    for (int x = 0; x < size; x++) {
      for (int y = 0; y < size; y++) {
        int n = matrix.get(x, y);
        if (n > neo) {
          break;
        }
        if (n == neo) {
          return new int[]{x, y};
        }
      }
    }
    throw new IllegalArgumentException("Neo is The Zero");
  }
}