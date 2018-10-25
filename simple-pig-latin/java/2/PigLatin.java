import java.util.regex.Pattern;

public class PigLatin {
    private static final Pattern regex = Pattern.compile("(\\w)(\\w*)");

    public static String pigIt(String str) {
        return regex.matcher(str).replaceAll("$2$1ay");
    }
}