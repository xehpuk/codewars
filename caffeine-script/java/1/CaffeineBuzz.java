public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
    return !div(n, 3) ? "mocha_missing!"
                      : div(n, 4) ? "CoffeeScript"
                                  : div(n, 2) ? "JavaScript"
                                              : "Java";
  }
  
  static boolean div(int n, int d) {
    return n % d == 0;
  }
}