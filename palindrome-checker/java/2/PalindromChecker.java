public class PalindromChecker {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        for (int l = next(str, -1), r = previous(str, str.length()); l < r; l = next(str, l), r = previous(str, r)) {
            if (Character.toUpperCase(str.charAt(l)) != Character.toUpperCase(str.charAt(r))) {
                return false;
            }
        }
        return true;
    }

    private int next(String str, int i) {
        return find(str, i, 1);
    }

    private int previous(String str, int i) {
        return find(str, i, -1);
    }

    private int find(String str, int i, int k) {
        for (int j = i + k; j >= 0 && j < str.length(); j += k) {
            if (Character.isLetterOrDigit(str.charAt(j))) {
                return j;
            }
        }
        return i;
    }
}