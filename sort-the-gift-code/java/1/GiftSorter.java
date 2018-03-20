import static java.util.Arrays.sort;

public class GiftSorter{
  public String sortGiftCode(String code){
    char[] codeCharArray = code.toCharArray();
    sort(codeCharArray);
    return String.valueOf(codeCharArray);
  }
}