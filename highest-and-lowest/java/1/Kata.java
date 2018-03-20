public class Kata {
  public static String HighAndLow(String numbers) {
    int high = Integer.MIN_VALUE;
    int low = Integer.MAX_VALUE;
    for (String number : numbers.split(" ")) {
      int n = Integer.parseInt(number);
      high = Math.max(high, n);
      low = Math.min(low, n);
    }
    return high + " " + low;
  }
}