public class ShadesOfGrey {
  static String[] shadesOfGrey(int n) {
    return n <= 0 ? new String[0]
                  : java.util.stream.IntStream
                      .range(1, 0xFF)
                      .limit(n)
                      .mapToObj(i -> String.format("%02x", i))
                      .map(x -> '#' + x + x + x)
                      .toArray(String[]::new);
  }
}