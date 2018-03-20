import java.util.function.ToDoubleFunction;

public class FunctionalProgramming {
  public static ToDoubleFunction<Triangle> f = t -> {
    t.setArea(.5 * t.base * t.height);
    return t.getArea();
  };
}