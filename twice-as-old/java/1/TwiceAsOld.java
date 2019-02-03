public class TwiceAsOld {
  @Deprecated
  public static int TwiceAsOld(int dadYears, int sonYears) {
    return twiceAsOld(dadYears, sonYears);
  }
  
  public static int twiceAsOld(int dadYears, int sonYears) {
    return Math.abs(dadYears - 2 * sonYears);
  }
}