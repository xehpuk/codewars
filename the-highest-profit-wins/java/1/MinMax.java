class MinMax {
    public static int[] minMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : arr) {
          min = Math.min(min, n);
          max = Math.max(max, n);
        }
        return new int[]{min, max};
    }
}