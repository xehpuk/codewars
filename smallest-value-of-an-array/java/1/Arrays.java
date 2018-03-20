public class Arrays {
  public static int findSmallest(final int[] numbers, final String toReturn) {
    int index = 0;
    int value = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      final int n = numbers[i];
      if (n < value) {
        index = i;
        value = n;
      }
    }
    switch (toReturn) {
      case "index":
        return index;
      case "value":
        return value;
      default:
        return 0xCAFEBABE;
    }
  }
}