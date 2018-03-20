public class WindInfo {
  public static String message(String r, int wd, int ws) {
    double a = Math.toRadians(Integer.parseInt(r.substring(0, 2)) * 10 - wd);
    int cw = (int) Math.round(Math.sin(a) * ws);
    int hw = (int) Math.round(Math.cos(a) * ws);
    return String.format("%swind %d knots. Crosswind %d knots from your %s.",
        hw >= 0 ? "Head" : "Tail", Math.abs(hw), Math.abs(cw), cw <= 0 ? "right" : "left");
  }
}