import java.util.HashMap;

public class User {
  private static final int POINTS_PER_RANK = 100;
  
  public int rank = Rank.KYU8.rank;
  public int progress;
  
  public void incProgress(final int rank) {
    Rank currentRank = Rank.fromRank(this.rank);
    if (currentRank == Rank.DAN8) {
      return;
    }
    final int points = currentRank.completeActivity(Rank.fromRank(rank));
    progress += points;
    final int ranksUp = progress / POINTS_PER_RANK;
    for (int i = 0; i < ranksUp; i++) {
      currentRank = currentRank.next();
      this.rank = currentRank.rank;
    }
    progress = currentRank == Rank.DAN8 ? 0 : progress % POINTS_PER_RANK;
  }
  
  private static enum Rank {
    KYU8(-8, 0),
    KYU7(-7, 1),
    KYU6(-6, 2),
    KYU5(-5, 3),
    KYU4(-4, 4),
    KYU3(-3, 5),
    KYU2(-2, 6),
    KYU1(-1, 7),
    DAN1(1, 8),
    DAN2(2, 9),
    DAN3(3, 10),
    DAN4(4, 11),
    DAN5(5, 12),
    DAN6(6, 13),
    DAN7(7, 14),
    DAN8(8, 15);
    
    private static final HashMap<Integer, Rank> rankToRanks;
    private static final HashMap<Integer, Rank> orderToRanks;
    
    static {
      final Rank[] values = values();
      rankToRanks = new HashMap<>(values.length);
      orderToRanks = new HashMap<>(values.length);
      for (final Rank rank : values) {
        rankToRanks.put(rank.rank, rank);
        orderToRanks.put(rank.order, rank);
      }
    }
    
    private static Rank fromRank(final int rank) {
      if (!rankToRanks.containsKey(rank)) {
        throw new IllegalArgumentException(String.format("Unknown rank: %d", rank));
      }
      return rankToRanks.get(rank);
    }
    
    private final int rank;
    private final int order;

    private Rank(final int rank, final int order) {
      this.rank = rank;
      this.order = order;
    }
    
    private int completeActivity(final Rank activityRank) {
      final int orderDifference = activityRank.order - order;
      if (orderDifference == 0) {
        return 3;
      }
      if (orderDifference == -1) {
        return 1;
      }
      if (orderDifference <= -2) {
        return 0;
      }
      return 10 * orderDifference * orderDifference;
    }
    
    private Rank next() {
      final int next = order + 1;
      return orderToRanks.containsKey(next) ? orderToRanks.get(next) : this;
    }
  }
}