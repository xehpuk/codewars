import java.util.*;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word) {
        Map<Integer, Integer> letters = word.codePoints().map(Character::toLowerCase).collect(HashMap<Integer, Integer>::new, (map, i) -> {
            map.computeIfPresent(i, (k, v) -> v + 1);
            map.putIfAbsent(i, 1);
        }, null);
        return word.codePoints().map(Character::toLowerCase).mapToObj(cp -> letters.get(cp) > 1 ? ")" : "(").collect(Collectors.joining());
    }
}