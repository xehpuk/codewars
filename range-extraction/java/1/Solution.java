import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public static String rangeExtraction(int[] arr) {
        if (arr.length == 0) {
            return "";
        }

        ArrayList<int[]> ranges = new ArrayList<>();
        int[] range = initRange(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int n = arr[i];
            if (n == range[1] + 1) {
                range[1] = n;
            } else {
                ranges.add(range);
                range = initRange(n);
            }
        }
        ranges.add(range);
        
        return ranges
            .stream()
            .map(r -> r[0] == r[1]
                ? Integer.toString(r[1])
                : r[0] + (r[0] == r[1] - 1 ? "," : "-") + r[1])
            .collect(Collectors.joining(","));
    }

    private static int[] initRange(int n) {
        return new int[]{n, n};
    }
}