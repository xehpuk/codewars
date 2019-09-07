import java.util.Arrays;

public class Solution {
    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int sum = 0;
        for (int i = 0, l = passed.length, k = l / 2, j = l - 1; i < k; i++, j--) {
            sum += passed[i] * passed[j];
        }
        return sum;
    }
}