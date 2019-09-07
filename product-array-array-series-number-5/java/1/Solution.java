public class Solution {
    public static long[] productArray(int[] numbers) {
        long product = 1;
        for (int n : numbers) {
            product *= n;
        }
        long[] products = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            products[i] = product / numbers[i];
        }
        return products;
    }
}