import java.util.Arrays;

public class Counter {
  @Deprecated
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return (int) countSheep(arrayOfSheeps);
  }
  
  public static long countSheep(Boolean[] arrayOfSheep) {
    return Arrays.stream(arrayOfSheep)
                 .filter(sheep -> sheep == Boolean.TRUE)
                 .count();
  }
}