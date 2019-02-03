public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 < len2) {
            return false;
        }

        int[] arr2 = new int['z' - 'a' + 1];
        for (int i = 0; i < len2; i++) {
            arr2[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < len1; i++) {
            int chr1 = str1.charAt(i) - 'a';
            int num2 = arr2[chr1];

            if (num2 > 0) {
                if (--len2 == 0) {
                    return true;
                }

                arr2[chr1] = num2 - 1;
            }
        }

        return false;
    }
}