public class Solution {
  private int[] divisors = {3, 5};
  
  public int solution(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (isMultiple(i)) {
        sum += i;
      }
    }
    return sum;
  }
  
  private boolean isMultiple(int number) {
    for (int divisor : divisors) {
      if (number % divisor == 0) {
        return true;
      }
    }
    return false;
  }
}