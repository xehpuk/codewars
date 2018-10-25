import java.time.*;
import java.util.stream.IntStream;

public class Kata {
  public static long unluckyDays(int year) {
    return IntStream.range(1, 13)
      .mapToObj(month -> LocalDate.of(year, month, 13))
      .map(date -> date.getDayOfWeek())
      .filter(day -> day == DayOfWeek.FRIDAY)
      .count();
  }
}