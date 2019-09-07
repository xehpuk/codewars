import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> arrayLeaders(int[] numbers) {
        int length = numbers.length;
        List<Integer> leaders = new ArrayList<>(length);
        for (int i = length - 1, sum = 0; i >= 0; i--) {
            int num = numbers[i];
            if (num > sum) {
                leaders.add(0, num);
            }
            sum += num;
        }
        return leaders;
    }
}