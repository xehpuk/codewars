import java.util.*;

public class DirReduction {
  private static final int BITMASK = 0b11;
  
  public static String[] dirReduc(final String[] allDirs) {
    final Deque<String> dirs = new LinkedList<>();
    for (final String dir : allDirs) {
      if (dirs.isEmpty() || (ordinal(dirs.peekLast()) ^ ordinal(dir) & BITMASK) != BITMASK) {
        dirs.addLast(dir);
      } else {
        dirs.removeLast();
      }
    }
    return dirs.toArray(new String[dirs.size()]);
  }
  private static int ordinal(final String dir) {
    return Dir.valueOf(dir).ordinal();
  }
  
  private static enum Dir {
    EAST, NORTH, SOUTH, WEST; // important lexicographic order
  }
}