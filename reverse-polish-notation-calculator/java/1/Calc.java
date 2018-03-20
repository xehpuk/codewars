import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class Calc {
  private static final String DELIMITER = " ";
  private static final String OPERATOR_PLUS = "+";
  private static final String OPERATOR_MINUS = "-";
  private static final String OPERATOR_MULTIPLY = "*";
  private static final String OPERATOR_DIVIDE = "/";
  
  private static final Map<String, DoubleBinaryOperator> OPERATORS;
  
  static {
    final Map<String, DoubleBinaryOperator> operators = new HashMap<>(4, 1);
    operators.put(OPERATOR_PLUS, (summand2, summand1) -> summand1 + summand2);
    operators.put(OPERATOR_MINUS, (subtrahend, minuend) -> minuend - subtrahend);
    operators.put(OPERATOR_MULTIPLY, (factor2, factor1) -> factor1 * factor2);
    operators.put(OPERATOR_DIVIDE, (divisor, dividend) -> dividend / divisor);
    OPERATORS = Collections.unmodifiableMap(operators);
  }

  public double evaluate(final String expr) {
    if (expr.isEmpty()) {
      return 0;
    }
    
    final String[] parts = expr.split(DELIMITER);
    final Deque<Double> operands = new ArrayDeque<>(parts.length / 2 + 1);
    for (final String part : parts) {
      final DoubleBinaryOperator operator = OPERATORS.get(part);
      operands.push(operator == null ? Double.parseDouble(part) : operator.applyAsDouble(operands.pop(), operands.pop()));
    }
    return operands.peek();
  }
}