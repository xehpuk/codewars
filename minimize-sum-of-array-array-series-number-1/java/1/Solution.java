import java.util.Arrays;

public class Solution
{
    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int sum = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            sum += passed[i] * passed[passed.length - i - 1];
        }
        return sum;
    }
}