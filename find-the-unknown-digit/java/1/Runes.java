import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class Runes {
  private static final int RADIX = 10;
  private static final char RUNE = '?';
  private static final char NEGATE = '-';
  private static final char EQUALS = '=';

  public static int solveExpression(final String expression) {
    return RunedExpression.fromString(expression).findDigit();
  }
  
  static class RunedExpression {
    static RunedExpression fromString(final String expression) {
      int index = 0;
      final String leftString = number(expression, index);
      index += leftString.length();
      final char operatorChar = operator(expression, index++);
      final String rightString = number(expression, index);
      index += rightString.length();
      equals(expression, index++);
      final String resultString = number(expression, index);
      index += resultString.length();
      if (index < expression.length()) {
        throw new IllegalArgumentException(String.format("unconsumed characters at %d of \"%s\"", index, expression));
      }
      return new RunedExpression(leftString, operatorChar, rightString, resultString);
    }
    
    static String number(final String expression, final int fromIndex) {
      final int length = expression.length();
      final StringBuilder number = new StringBuilder(length - fromIndex);
      for (int i = fromIndex; i < length; i++) {
        final char c = expression.charAt(i);
        if (c == NEGATE) {
          if (i != fromIndex) {
            break;
          }
          number.append(c);
        } else if (c == RUNE || Character.isDigit(c)) {
          number.append(c);
        } else {
          break;
        }
      }
      final int numberLength = number.length();
      if (numberLength == 0 || numberLength == 1 && number.charAt(0) == NEGATE) {
        throw new IllegalArgumentException(String.format("expected number at %d from \"%s\", got \"%s\" instead", fromIndex, expression, number));
      }
      return number.toString();
    }

    static char operator(final String expression, final int index) {
      return expression.charAt(index);
    }

    static void equals(final String expression, final int index) {
      final char c = expression.charAt(index);
      if (c != EQUALS) {
        throw new IllegalArgumentException(String.format("expected '%c' at %d from \"%s\", got '%c' instead", EQUALS, index, expression, c));
      }
    }
    
    final String leftString;
    final char operatorChar;
    final String rightString;
    final String resultString;

    RunedExpression(final String leftString, final char operatorChar, final String rightString, final String resultString) {
      this.leftString = leftString;
      this.operatorChar = operatorChar;
      this.rightString = rightString;
      this.resultString = resultString;
    }
    
    int findDigit() {
      final Operator operator = Operator.fromSymbol(operatorChar);
      for (int i = leadingZero() ? 1 : 0; i < RADIX; i++) {
        final char digit = Character.forDigit(i, RADIX);
        final String digitString = String.valueOf(digit);
        if (strings().noneMatch(s -> s.contains(digitString))) {
          final int[] numbers = strings()
              .map(string -> string.replace(RUNE, digit))
              .mapToInt(Integer::parseInt)
              .toArray();
          if (new Expression(numbers[0], operator, numbers[1], numbers[2]).eval()) {
            return i;
          }
        }
      }
      return -1;
    }
    
    boolean leadingZero() {
      return strings().anyMatch(s -> s.length() > 1 && (s.charAt(0) == RUNE || s.charAt(0) == NEGATE && s.charAt(1) == RUNE));
    }

    private Stream<String> strings() {
      return Stream.of(leftString, rightString, resultString);
    }
  }
  
  static class Expression {
    final int firstOperand;
    final IntBinaryOperator operator;
    final int secondOperand;
    final int result;

    Expression(final int left, final IntBinaryOperator operator, final int right, final int result) {
      this.firstOperand = left;
      this.operator = operator;
      this.secondOperand = right;
      this.result = result;
    }
    
    boolean eval() {
      return operator.applyAsInt(firstOperand, secondOperand) == result;
    }
  }
  
  enum Operator implements IntBinaryOperator {
    PLUS('+') {
      @Override
      public int applyAsInt(final int left, final int right) {
        return left + right;
      }
    },
    MINUS('-') {
      @Override
      public int applyAsInt(final int left, final int right) {
        return left - right;
      }
    },
    MULTIPLY('*') {
      @Override
      public int applyAsInt(final int left, final int right) {
        return left * right;
      }
    };
    
    static Operator fromSymbol(final char symbol) {
      for (final Operator operator : values()) {
        if (operator.symbol == symbol) {
          return operator;
        }
      }
      throw new IllegalArgumentException(String.format("'%c'", symbol));
    }
    
    final char symbol;

    Operator(final char symbol) {
      this.symbol = symbol;
    }
  }
}