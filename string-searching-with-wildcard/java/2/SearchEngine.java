import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngine {
    static int find(String needle, String haystack) {
        StringJoiner regexJoiner = new StringJoiner(".");
        Arrays.stream(needle.split("_", -1)).map(Pattern::quote).forEach(regexJoiner::add);
        Matcher matcher = Pattern.compile(regexJoiner.toString()).matcher(haystack);
        return matcher.find() ? matcher.start() : -1;
    }
}