import java.util.Arrays;

class WordSearch {
  static String[] findWord(String needle, String[] haystacks) {
    final String[] findings = Arrays.stream(haystacks).filter(z -> containsIgnoreCase(z, needle)).toArray(String[]::new);
    return findings.length > 0 ? findings : new String[]{"Empty"};
  }

  static boolean containsIgnoreCase(final String haystack, final String needle) {
    return indexOfIgnoreCase(haystack, needle) >= 0;
  }

  static int indexOfIgnoreCase(final String haystack, final String needle) {
    final int haystackLength = haystack.length();
    final int needleLength = needle.length();
    for (int i = 0; i <= haystackLength - needleLength; i++) {
      if (haystack.regionMatches(true, i, needle, 0, needleLength)) {
        return i;
      }
    }
    return -1;
  }
}