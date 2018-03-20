import java.util.*;

public class BallotsCounter {
  public static String getWinner(final List<String> listOfBallots) {
    final int numberOfBallots = listOfBallots.size();
    if (numberOfBallots == 0) {
      return null;
    }
    final Map<String, Integer> counts = new HashMap<>();
    for (final String ballot : listOfBallots) {
      counts.put(ballot, counts.getOrDefault(ballot, 0) + 1);
    }
    final Map.Entry<String, Integer> mostBallots = counts.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).findFirst().get();
    return 2 * mostBallots.getValue() > numberOfBallots ? mostBallots.getKey() : null;
  }
}