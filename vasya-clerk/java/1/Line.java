public class Line {
  public static String Tickets(int[] peopleInLine) {
    int bill25 = 0, bill50 = 0, bill100 = 0;
    for (int personInLine : peopleInLine) {
      switch (personInLine) {
        case 25:
          bill25++;
          break;
        case 50:
          if (bill25 == 0) {
            return "NO";
          }
          bill25--;
          bill50++;
          break;
        case 100:
          if (bill25 == 0) {
            return "NO";
          }
          if (bill50 == 0) {
            if (bill25 < 3) {
              return "NO";
            }
            bill25 -= 3;
          } else {
            bill50--;
            bill25--;
          }
          bill100++;
          break;
        default:
          return "WTF";
      }
    }
    return "YES";
  }
}