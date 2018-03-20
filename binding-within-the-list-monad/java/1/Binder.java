import java.util.*;
import java.util.function.Function;

public class Binder<T, I> {
  public List<I> bind(List<T> list, Function<T, List<I>> func) {
    List<I> is = new ArrayList<>();
    for (T t : list) {
      is.addAll(func.apply(t));
    }
    return is;
  }
}