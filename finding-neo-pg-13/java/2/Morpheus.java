public class Morpheus {
  public int[] find(Matrix matrix, int neo) {
    int size = matrix.size();
    for (int x = 0, toIndex = size; x < size; x++) {
      int y = binarySearch(matrix, x, toIndex, neo);
      if (y >= 0) {
        return new int[]{x, y};
      }
      toIndex = -(y + 1);
    }
    return null;
  }

  /**
   * @see java.util.Arrays#binarySearch0(int[], int, int, int)
   */
  private static int binarySearch(Matrix matrix, int x, int toIndex, int key) {
    int low = 0;
    int high = toIndex - 1;

    while (low <= high) {
      int mid = (low + high) >>> 1;
      int midVal = matrix.get(x, mid);

      if (midVal < key) {
        low = mid + 1;
      } else if (midVal > key) {
        high = mid - 1;
      } else {
        return mid;
      }
    }
    return -(low + 1);
  }
}