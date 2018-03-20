public class Evaporator { 
  public static int evaporator(double content, double evapPerDay, double threshold) {
    content = 100;
    evapPerDay /= 100;
    int day = 0;
    for (double restPerDay = 1 - evapPerDay; content > threshold; content *= restPerDay, day++);
    return day;
  }
}