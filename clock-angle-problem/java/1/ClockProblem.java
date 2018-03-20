public class ClockProblem {
  public static int calculateAngle(int hour, int minute) {
    int minuteAngle = minute * 6;
    int hourAngle = hour % 12 * 30 + minute / 2;
    int diffAngle = Math.abs(minuteAngle - hourAngle);
    return diffAngle <= 90 ? diffAngle : 180 - diffAngle;
  }
}