import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngine {
    static int find(String needle, String haystack){
        String[] split = needle.split("_", -1);
        StringJoiner regexJoiner = new StringJoiner(".");
        for (String part : split) {
          regexJoiner.add(Pattern.quote(part));
        }
        Pattern regex = Pattern.compile(regexJoiner.toString());
        Matcher matcher = regex.matcher(haystack);
        return matcher.find() ? matcher.start() : -1;
    }
}