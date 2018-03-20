import java.lang.reflect.Field;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Psychic {
  private static final AtomicLong SEED = stealSeedFromMath$RandomNumberGeneratorHolder();

  private static AtomicLong stealSeedFromMath$RandomNumberGeneratorHolder() {
    try {
      for (final Class<?> clazz : Math.class.getDeclaredClasses()) {
        if ("RandomNumberGeneratorHolder".equals(clazz.getSimpleName())) {
          final Field randomNumberGeneratorField = clazz.getDeclaredField("randomNumberGenerator");
          randomNumberGeneratorField.setAccessible(true);
          final Random randomNumberGenerator = (Random) randomNumberGeneratorField.get(null);
          final Field seedField = Random.class.getDeclaredField("seed");
          seedField.setAccessible(true);
          return (AtomicLong) seedField.get(randomNumberGenerator);
        }
      }
    } catch (final IllegalAccessException | NoSuchFieldException | SecurityException ex) {}
    throw new AssertionError();
  }

  public static double guess() {
    final long value = SEED.get();
    final double random = Math.random();
    SEED.set(value);
    return random;
  }
}