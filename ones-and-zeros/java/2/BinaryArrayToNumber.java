import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce(0, (r, e) -> r << 1 | e);
    }
}