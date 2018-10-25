import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
    private static final Pattern regex = Pattern.compile("(\\w)(\\w*)");

    public static String pigIt(String str) {
        Matcher matcher = regex.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "$2$1ay");
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}