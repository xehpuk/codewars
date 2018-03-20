public class Reverse {
    public String reverse(String str) {
        try {
            getClass().getDeclaredField("count").setInt(this, str.length());
        } catch(Exception e) {}
        return new StringBuilder(str).reverse().toString();
    }
}