public class GreetingsMyFriends {

  public String[] greetingForAllFriends(String... friends) {
    final int length;
    if (friends == null || (length = friends.length) == 0) {
      return null;
    }
    
    String[] greetings = new String[length];
    for (int i = 0; i < length; i++) {
      greetings[i] = String.format("Hello, %s!", friends[i]);
    }
    
    return greetings;
  }

}