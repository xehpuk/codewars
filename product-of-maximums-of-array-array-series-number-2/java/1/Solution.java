import java.util.Arrays;

public class Solution {
    public static long maxProduct(int[] numbers, int subSize) {
        return Arrays.stream(numbers)
                     .sorted()
                     .skip(numbers.length - subSize)
                     .mapToLong(i -> i)
                     .reduce(1L, (m, n) -> m * n);
    }
}