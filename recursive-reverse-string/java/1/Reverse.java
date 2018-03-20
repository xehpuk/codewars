public class Reverse {
    public String reverse(String str) {
      return str.length() <= 1 ? 
        str : reverse(str.substring(1)) + str.substring(0,1);

    }
}