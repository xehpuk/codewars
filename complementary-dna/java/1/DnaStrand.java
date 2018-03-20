public class DnaStrand {
  public static String makeComplement(String dna) {
    char[] complement = dna.toCharArray();
    for (int i = 0; i < complement.length; i++) {
      complement[i] ^= (complement[i] & 0b10) == 0b10 ? 0b100 : 0b10101;
    }
    return String.valueOf(complement);
  }
}