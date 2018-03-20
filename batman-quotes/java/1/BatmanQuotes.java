import java.util.regex.*;

public class BatmanQuotes{
  public static String getQuote(String[] quotes, String hero) {
    String quote = quotes[quoteIndex(hero)];
    String realHero = realHero(hero);
    return String.format("%s: %s", realHero, quote);
  }
  
  static int quoteIndex(String hero) {
    Matcher matcher = Pattern.compile("\\d+").matcher(hero);
    matcher.find();
    return Integer.parseInt(matcher.group());
  }
  
  static String realHero(String hero) {
    switch (hero.charAt(0)) {
      case 'B':
        return "Batman";
      case 'J':
        return "Joker";
      case 'R':
        return "Robin";
    }
    return hero;
  }
}