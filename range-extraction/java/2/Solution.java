import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public static String rangeExtraction(int[] arr) {
        if (arr.length == 0) {
            return "";
        }

        ArrayList<Range> ranges = new ArrayList<>();
        Range range = Range.init(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int n = arr[i];
            if (n == range.end + 1) {
                range.end = n;
            } else {
                ranges.add(range);
                range = Range.init(n);
            }
        }
        ranges.add(range);
        
        return ranges
            .stream()
            .map(Range::toString)
            .collect(Collectors.joining(","));
    }

    static class Range {
        int start;
        int end;

        Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        static Range init(int n) {
            return new Range(n, n);
        }

        @Override
        public String toString() {
            return start == end
                ? Integer.toString(start)
                : start + (start == end - 1 ? "," : "-") + end;
        }
    }
}