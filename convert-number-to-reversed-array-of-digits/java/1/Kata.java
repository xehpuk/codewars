class Kata {
    public static int[] digitize(long n) {
        int length = n == 0 ? 1 : (int) Math.log10(n) + 1;
        int[] digits = new int[length];
        for (int i = 0; i < length; i++, n /= 10) {
            digits[i] = (int) (n % 10);
        }
        return digits;
    }
}