public class TugOWar {
  public static final String TEAM1 = "Team 1 wins!";
  public static final String TEAM2 = "Team 2 wins!";
  public static final String TIE = "It's a tie!";
  
  public static String tugOWar(final int[][] teams) {
    final int[] team1 = teams[0];
    final int[] team2 = teams[1];
    final int sum1 = sum(team1);
    final int sum2 = sum(team2);
    if (sum1 > sum2) return TEAM1;
    if (sum1 < sum2) return TEAM2;
    final int anchor1 = team1[0];
    final int anchor2 = team2[team2.length - 1];
    if (anchor1 > anchor2) return TEAM1;
    if (anchor1 < anchor2) return TEAM2;
    return TIE;
  }

  private static int sum(final int[] team) {
    return java.util.Arrays.stream(team).sum();
  }
}