import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Cubes {
  private static final int BASE = 10;

  public String isSumOfCubes(String s) {
    List<Integer> sumOfCubes = sumOfCubes(s);
    if (sumOfCubes.isEmpty()) {
      return "Unlucky";
    }
    sumOfCubes.add(sumOfCubes.stream().mapToInt(Integer::intValue).sum());
    StringBuilder builder = new StringBuilder();
    for (int sumOfCube : sumOfCubes) {
      builder.append(sumOfCube).append(' ');
    }
    return builder.append("Lucky").toString();
  }
  
  static List<Integer> sumOfCubes(String s) {
    List<Integer> sumsOfCubes = new ArrayList<>();
    Matcher matcher = Pattern.compile("\\d{1,3}").matcher(s);
    while (matcher.find()) {
      int n = Integer.parseInt(matcher.group());
      if (isSumOfCubes(n)) {
        sumsOfCubes.add(n);
      }
    }
    return sumsOfCubes;
  }
  
  static boolean isSumOfCubes(int n) {
    return n == sumOfCubes(n);
  }

  static int sumOfCubes(int n) {
    return n < BASE ? cube(n) : cube(n % BASE) + sumOfCubes(n / BASE);
  }
  static int cube(int n) {
    return n * n * n;
  }
}