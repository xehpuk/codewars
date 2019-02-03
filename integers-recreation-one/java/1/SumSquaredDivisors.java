import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumSquaredDivisors {
  public static String listSquared(long m, long n) {
        StringBuilder result = new StringBuilder().append('[');
  
        for (long i = m; i <= n; i++) {
            long sum = getDivisorsSquareSum(i);
            if (isSquare(sum)) {
                if (result.length() > 1) {
                    result.append(", ");
                }
                result.append('[').append(i).append(", ").append(sum).append(']');
            }
        }
        
        return result.append(']').toString();
    }

    static long getDivisorsSquareSum(long m) {
        return getDivisors(m)
            .stream()
            .mapToLong(Long::longValue)
            .reduce(0, (sum, divisor) -> sum + divisor * divisor);
    }

    static List<Long> getDivisors(long m) {
        if (m == 1) {
            return Collections.singletonList(1l);
        }

        List<Long> divisors = new ArrayList<>();
        divisors.add(1l);

        for (long d = 2, n = (long) m / d; d <= n; d++) {
            if (m % d == 0) {
                divisors.add(d);
            }
        }

        divisors.add(m);

        return divisors;
    }
    
    static boolean isSquare(long m) {
        double sqrt = Math.sqrt(m);
        return sqrt == Math.floor(sqrt);
    }
}