public class ClockProblem {
  public static int calculateAngle(int hour, int minute) {
    int minuteAngle = minute * 6;
    int hourAngle = hour * 30 + minute / 2;
    int diff = Math.abs(minuteAngle - hourAngle);
    return diff <= 180 ? diff : 360 - diff;
  }
}