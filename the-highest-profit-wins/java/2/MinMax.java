class MinMax {
  public static int[] minMax(int[] arr) {
    return java.util.Arrays.stream(arr)
      .collect(
        () -> new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE},
        (minMax, n) -> {
          minMax[0] = Math.min(minMax[0], n);
          minMax[1] = Math.max(minMax[1], n);
        },
        null
      );
  }
}