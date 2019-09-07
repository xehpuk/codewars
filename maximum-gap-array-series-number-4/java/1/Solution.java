import java.util.Arrays;

public class Solution {
    public static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        int max = Math.abs(numbers[0] - numbers[1]);
        for (int i = 1; i < numbers.length - 1; i++) {
            max = Math.max(max, Math.abs(numbers[i] - numbers[i + 1]));
        }
        return max;
    }
}