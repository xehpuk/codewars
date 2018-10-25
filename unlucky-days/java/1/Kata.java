import java.time.*;

public class Kata {
  public static int unluckyDays(int year) {
    int days = 0;
    
    for (int m = 1; m <= 12; m++) {
      if (LocalDate.of(year, m, 13).getDayOfWeek() == DayOfWeek.FRIDAY) {
        days++;
      }
    }
    
    return days;
  }
}