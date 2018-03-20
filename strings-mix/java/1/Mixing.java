import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class Mixing {
    public static String mix(String s1, String s2) {
        HashMap<Character, Integer> l1 = letters(s1);
        HashMap<Character, Integer> l2 = letters(s2);
        HashMap<Character, Integer> m = merge(l1, l2);
        return m.entrySet()
                .stream()
                .map(e -> {
                    char k = e.getKey();
                    int ct = l1.getOrDefault(k, 0).compareTo(l2.getOrDefault(k, 0));
                    return new AbstractMap.SimpleEntry<Character, String>(ct < 0 ? '2' : ct > 0 ? '1' : '=', repeat(e.getKey(), e.getValue())) {
                        @Override
                        public String toString() {
                            return getKey() + ":" + getValue();
                        }
                    };
                })
                .sorted(Comparator.<Map.Entry<Character, String>>comparingInt(e -> e.getValue().length())
                        .reversed()
                        .thenComparing(e -> e.getKey())
                        .thenComparing(e -> e.getValue()))
                .map(Object::toString)
                .collect(Collectors.joining("/"));
    }
    
    static String repeat(char c, int n) {
        char[] cs = new char[n];
        Arrays.fill(cs, c);
        return String.valueOf(cs);
    }
    
    static <K, R extends Map<K, Integer> & Cloneable> R merge(R first, R second) {
        try {
            Method clone = first.getClass().getDeclaredMethod("clone");
            R merged = (R) clone.invoke(first);
            second.forEach((k, v) -> {
                merged.merge(k, v, Math::max);
            });
            return merged;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
            throw new InternalError(ex);
        }
    }

    static HashMap<Character, Integer> letters(String s) {
        HashMap<Character, Integer> letters = s.codePoints().filter(Mixing::isLowerCase).collect(HashMap<Character, Integer>::new, (map, i) -> {
            char c = (char) i;
            map.computeIfPresent(c, (k, v) -> v + 1);
            map.putIfAbsent(c, 1);
        }, null);
        Iterator<Map.Entry<Character, Integer>> iterator = letters.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if (entry.getValue() == 1) {
                iterator.remove();
            }
        }
        return letters;
    }
    
    static boolean isLowerCase(int codePoint) {
        return codePoint >= 'a' && codePoint <= 'z';
    }
}