import java.time.*;
import java.util.Arrays;

public class Kata {
  public static long unluckyDays(int year) {
    return Arrays.stream(Month.values())
      .map(month -> LocalDate.of(year, month, 13))
      .map(date -> date.getDayOfWeek())
      .filter(day -> day == DayOfWeek.FRIDAY)
      .count();
  }
}