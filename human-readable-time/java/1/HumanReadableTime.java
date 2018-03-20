public class HumanReadableTime {
  public static int MIN_TO_SECS = 60;
  public static int HOUR_TO_MINS = 60;

  public static String makeReadable(int totalSeconds) {
    int noOfSeconds = totalSeconds % MIN_TO_SECS;
    int totalMinutes = totalSeconds / MIN_TO_SECS;
    int noOfMinutes = totalMinutes % HOUR_TO_MINS;
    int noOfHours = totalMinutes / HOUR_TO_MINS;
    return String.format("%02d:%02d:%02d", noOfHours, noOfMinutes, noOfSeconds);
  }
}