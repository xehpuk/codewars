public class Ghost {
  static final String[] COLORS = {"white", "yellow", "purple", "red"};
  static int count;
  final int color;
  
  Ghost() {
    color = count = (count + 1) % COLORS.length;
  }
  
  String getColor() {
    return COLORS[color];
  }
}