import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int n = 0;
        for (int b : binary) {
          n <<= 1;
          n |= b;
        }
        return n;
    }
}