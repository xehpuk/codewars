public class Greeter {
  public static String greet(String name) {
    return "Johnny".equals(name) ? "Hello, my love!" : String.format("Hello, %s!", name);
  }
}