public class GuesserSolution extends Guesser {

  public int getNumber() {
    Range range = new Range(1, 1000);
    while (!range.isSingleton()) {
      int guess = range.getMedian();
      String response = guess(guess);
      switch (response) {
        case "Too high!":
          range.to = guess - 1;
          break;
        case "Too low!":
          range.from = guess + 1;
          break;
        case "Correct!":
          return guess;
        default:
          throw new IllegalArgumentException(String.format("Unexpected response: %s", response));
      }
    }
    return range.from;
  }
  
  private static class Range {
    int from;
    int to;
    
    Range(int from, int to) {
      if (from > to) {
        throw new IllegalArgumentException(String.format("from (%d) > to (%d)", from, to));
      }
      
      this.from = from;
      this.to = to;
    }
    
    boolean isSingleton() {
      return from == to;
    }
    
    int getMedian() {
      return (from + to) / 2;
    }
  }

}