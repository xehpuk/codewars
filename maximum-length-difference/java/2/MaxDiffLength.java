class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
          return -1;
        }
        
        int[] minmax1 = minmax(a1);
        int[] minmax2 = minmax(a2);
        
        return Math.max(minmax1[1] - minmax2[0], minmax2[1] - minmax1[0]);
    }

    static int[] minmax(String[] a) {
        int first = a[0].length();
        int min = first;
        int max = first;
        
        for (int i = 1; i < a.length; i++) {
            int l = a[i].length();
            if (l < min) {
                min = l;
            } else if (l > max) {
                max = l;
            }
        }
        
        return new int[]{min, max};
    }
}