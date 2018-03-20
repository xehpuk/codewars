import static java.lang.Math.*;

public class Circle {
  public static double area(double radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException(String.format("radius = %d <= 0", radius));
    }
    return PI * pow(radius, 2);
  }
}