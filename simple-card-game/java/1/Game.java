import java.util.*;

public class Game {

  private static final List<String> CARD_RANK = Arrays.asList(new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"});

  public String winner(String[] deckSteve, String[] deckJosh) {
    if (deckSteve.length != deckJosh.length) {
      throw new IllegalArgumentException(String.format("unequal lengths (steve: %d, josh: %d)", deckSteve.length, deckJosh.length));
    }
    
    int scoreSteve = 0, scoreJosh = 0;
    for (int i = 0; i < deckSteve.length; i++) {
      String cardSteve = deckSteve[i];
      int rankSteve = getRank(cardSteve);
      String cardJosh = deckJosh[i];
      int rankJosh = getRank(cardJosh);
      if (rankSteve > rankJosh) {
        scoreSteve++;
      } else if (rankJosh > rankSteve) {
        scoreJosh++;
      }
    }
    return scoreSteve > scoreJosh ?
             String.format("Steve wins %d to %d", scoreSteve, scoreJosh) :
             scoreJosh > scoreSteve ?
               String.format("Josh wins %d to %d", scoreJosh, scoreSteve) :
               "Tie";
  }
  
  private int getRank(String card) {
    int index = CARD_RANK.indexOf(card);
    if (index == -1) {
      throw new IllegalArgumentException(String.format("invalid card: %s", card));
    }
    return index;
  }
}