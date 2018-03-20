public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) {
      return false;
    }
    
    int x = 0, y = 0;
    for (char direction : walk) {
      switch (direction) {
        case 'n':
          y++;
          break;
        case 'e':
          x++;
          break;
        case 's':
          y--;
          break;
        case 'w':
          x--;
          break;
        default:
          return false;
      }
    }
    
    return (x | y) == 0;
  }
}