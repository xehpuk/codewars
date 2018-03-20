public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return String.format("%s %s banjo", name, playsBanjo(name) ? "plays" : "does not play");
  }
  
  private static boolean playsBanjo(String name) {
    return Character.toUpperCase(name.charAt(0)) == 'R';
  }
}