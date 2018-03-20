public class EvenOrOdd {
  @Deprecated // Violating the code conventions
  public static String even_or_odd(int number) {
    return evenOrOdd(number);
  }
  
  public static String evenOrOdd(int number) {
    return even(number) ? "Even" : "Odd";
  }
  
  static boolean even(int number) {
    return number % 2 == 0;
  }
}