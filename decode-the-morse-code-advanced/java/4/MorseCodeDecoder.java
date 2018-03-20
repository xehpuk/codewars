import java.util.*;
import java.util.function.*;

public class MorseCodeDecoder {
  public static final char BIT_OFF = '0';
  public static final char BIT_ON = '1';
  
  public static final int BIT_LETTER_PART_DOT_LENGTH = 1;
  public static final int BIT_LETTER_PART_DASH_LENGTH = 3;
  
  public static final String BIT_LETTER_PART_DOT = repeat(BIT_ON, BIT_LETTER_PART_DOT_LENGTH);
  public static final String BIT_LETTER_PART_DASH = repeat(BIT_ON, BIT_LETTER_PART_DASH_LENGTH);
  
  public static final int BIT_LETTER_PART_PAUSE_LENGTH = 1;
  public static final int BIT_LETTER_PAUSE_LENGTH = 3;
  public static final int BIT_WORD_PAUSE_LENGTH = 7;
  
  public static final String BIT_LETTER_PART_PAUSE = repeat(BIT_OFF, BIT_LETTER_PART_PAUSE_LENGTH);
  public static final String BIT_LETTER_PAUSE = repeat(BIT_OFF, BIT_LETTER_PAUSE_LENGTH);
  public static final String BIT_WORD_PAUSE = repeat(BIT_OFF, BIT_WORD_PAUSE_LENGTH);
  
  public static final char MORSE_DOT = '.';
  public static final char MORSE_DASH = '-';
  public static final char MORSE_DELIMITER = ' ';
  
  public static final int MORSE_LETTER_DELIMITER_LENGTH = 1;
  public static final int MORSE_WORD_DELIMITER_LENGTH = 3;
  
  public static final String MORSE_LETTER_DELIMITER = repeat(MORSE_DELIMITER, MORSE_LETTER_DELIMITER_LENGTH);
  public static final String MORSE_WORD_DELIMITER = repeat(MORSE_DELIMITER, MORSE_WORD_DELIMITER_LENGTH);
  
  public static final String WORD_DELIMITER = " ";
  
  private static final Map<String, Character> BIT_TO_MORSE;
  
  static {
    final Map<String, Character> bitToMorse = new HashMap<>(2, 1);
    bitToMorse.put(BIT_LETTER_PART_DOT, MORSE_DOT);
    bitToMorse.put(BIT_LETTER_PART_DASH, MORSE_DASH);
    BIT_TO_MORSE = Collections.unmodifiableMap(bitToMorse);
  }
  
  public static String decodeBits(final String bits) {
    final StringBuilder morseBuilder = new StringBuilder();
    for (final String bitWord : normalize(bits).split(BIT_WORD_PAUSE)) {
      if (morseBuilder.length() > 0) {
        morseBuilder.append(MORSE_WORD_DELIMITER);
      }
      final StringBuilder wordBuilder = new StringBuilder();
      for (final String bitLetter : bitWord.split(BIT_LETTER_PAUSE)) {
        if (wordBuilder.length() > 0) {
          wordBuilder.append(MORSE_LETTER_DELIMITER);
        }
        final StringBuilder letterBuilder = new StringBuilder();
        for (final String bitLetterPart : bitLetter.split(BIT_LETTER_PART_PAUSE)) {
          // deliberate cast to fail fast with NPE instead of appending "null"
          letterBuilder.append((char) BIT_TO_MORSE.get(bitLetterPart));
        }
        wordBuilder.append(letterBuilder);
      }
      morseBuilder.append(wordBuilder);
    }
    return morseBuilder.toString();
  }
    
  public static String decodeMorse(final String morseCode) {
    final StringBuilder decodeBuilder = new StringBuilder();
    for (final String morseWord : morseCode.trim().split(MORSE_WORD_DELIMITER)) {
      if (decodeBuilder.length() > 0) {
        decodeBuilder.append(WORD_DELIMITER);
      }
      for (final String morseLetter : morseWord.split(MORSE_LETTER_DELIMITER)) {
        decodeBuilder.append(MorseCode.get(morseLetter));
      }
    }
    return decodeBuilder.toString();
  }
  
  private static String normalize(final String bits) {
    final String trimmedBits = trim(bits, BIT_OFF);
    final int transmissionRate = getTransmissionRate(trimmedBits);
    
    return transmissionRate <= 1
        ? trimmedBits
        : loopThroughBits(trimmedBits, transmissionRate, new StringBuilder(trimmedBits.length() / transmissionRate), MorseCodeDecoder::repeat, StringBuilder::append).toString();
  }
  
  private static int getTransmissionRate(final String bits) {
    return bits.isEmpty()
        ? 0
        : loopThroughBits(bits, 1, new HashSet<Integer>(), (lastBit, bitCount) -> bitCount, Collection::add)
          .stream()
          .mapToInt(Integer::intValue)
          .reduce(MorseCodeDecoder::gcd)
          .getAsInt();
  }
  
  private static <C, E> C loopThroughBits(final String bits, final int step, final C container, final BiFunction<Character, Integer, E> elementProducer, final BiConsumer<C, E> appender) {
    char lastBit = bits.charAt(0);
    int bitCount = 1;
    for (int i = step; i < bits.length(); i += step) {
      final char bit = bits.charAt(i);
      if (bit == lastBit) {
        bitCount++;
      } else {
        appender.accept(container, elementProducer.apply(lastBit, bitCount));
        bitCount = 1;
        lastBit = bit;
      }
    }
    appender.accept(container, elementProducer.apply(lastBit, bitCount));
    return container;
  }
  
  private static int gcd(final int a, final int b) {
    return b == 0 ? a : gcd(b, a % b);
  }
  
  private static String trim(final String s, char c) {
    final StringBuilder sb = new StringBuilder(s);
    while (sb.length() > 0 && sb.charAt(0) == c)
      sb.deleteCharAt(0);
    while (sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
      sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }
  
  private static String repeat(final char c, final int times) {
    final StringBuilder repeat = new StringBuilder(times);
    for (int i = 0; i < times; i++) {
      repeat.append(c);
    }
    return repeat.toString();
  }
}