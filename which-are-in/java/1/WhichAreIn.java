import static java.util.Arrays.stream;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return stream(array1).filter(s1 -> stream(array2).anyMatch(s2 -> s2.contains(s1))).sorted().distinct().toArray(String[]::new);
    }
}