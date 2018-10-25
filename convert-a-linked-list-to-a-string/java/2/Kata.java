public class Kata {
  public static String stringify(Node list) {
    return stringify(list, new StringBuilder()).toString();
  }
  
  private static StringBuilder stringify(Node list, StringBuilder stringified) {
    return list == null
      ? stringified.append("null")
      : stringify(list.getNext(), stringified.append(list.getData()).append(" -> "));
  }
}