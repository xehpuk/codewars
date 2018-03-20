public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return String.format(playsBanjo(name) ? "%s plays banjo"
                                          : "%s does not play banjo", name);
  }
  
  private static boolean playsBanjo(String name) {
    return Character.toUpperCase(name.charAt(0)) == 'R';
  }
}