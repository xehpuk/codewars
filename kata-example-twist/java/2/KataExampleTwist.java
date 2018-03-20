public class KataExampleTwist {
    public static String[] kataExampleTwist() {
        return java.util.stream.Stream.generate(() -> "codewars")
                                      .limit(1000)
                                      .toArray(String[]::new);
    }
}