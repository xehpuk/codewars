import java.util.*;

class LineNumbering {

    static List<String> number(List<String> lines) {
        for (int i = 0, m = lines.size(); i < m; i++) {
          lines.set(i, String.format("%d: %s", i + 1, lines.get(i)));
        }
        return lines;
    }

}