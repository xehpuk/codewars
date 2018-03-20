import java.util.*;

public class SqInRect {
  public static List<Integer> sqInRect(int min, int max) {
    if (max == min) {
      return null;
    }
    List<Integer> sqInRect = new ArrayList<>();
    for (; max > 0 && min > 0; max -= min) {
      if (min > max) {
        int foo = max;
        max = min;
        min = foo;
      }
      sqInRect.add(min);
    }
    return sqInRect;
  }
}