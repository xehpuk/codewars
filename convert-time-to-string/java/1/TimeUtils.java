class TimeUtils {
  public static int MIN_TO_SECS = 60;
  public static int HOUR_TO_MINS = 60;
  public static int DAY_TO_HOURS = 24;
  
  public static String convertTime(int timeDiff) {
    int totalSeconds = timeDiff;
    int noOfSeconds = totalSeconds % MIN_TO_SECS;
    int totalMinutes = totalSeconds / MIN_TO_SECS;
    int noOfMinutes = totalMinutes % HOUR_TO_MINS;
    int totalHours = totalMinutes / HOUR_TO_MINS;
    int noOfHours = totalHours % DAY_TO_HOURS;
    int totalDays = totalHours / DAY_TO_HOURS;
    int noOfDays = totalDays;
    return String.format("%d %d %d %d", noOfDays, noOfHours, noOfMinutes, noOfSeconds);
  } 
}