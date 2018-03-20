import java.lang.reflect.Field;

public class Guesser {
  public void guess() {
    try {
      Field secretField = LittleClass.class.getDeclaredField("secret");
      secretField.setAccessible(true);
      String secret = (String) secretField.get(null);
      LittleClass.isMySecret(secret);
    } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException ex) {}
  }
}