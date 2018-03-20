public class FindOutlier {
  static int find(int[] integers) {
    int first = integers[0];
    boolean even = even(first);
    int successive = integers[1];
    if (even ^ even(successive)) {
      return even ^ even(integers[2]) ? first : successive;
    }
    for (int i = 2; i < integers.length; i++) {
      successive = integers[i];
      if (even ^ even(successive)) {
        return successive;
      }
    }
    throw new IllegalArgumentException(even ? "even" : "odd");
  }
  
  static boolean even(int n) {
    return n % 2 == 0;
  }
}