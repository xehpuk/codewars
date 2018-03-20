using System.Linq;

public class CandyProblem
{
  public static int GetMissingCandies(int[] candies)
  {
    if (candies.Length <= 1)
    {
      return -1;
    }
    var max = candies.Max();
    var count = 0;
    foreach (var candy in candies)
    {
      count += max - candy;
    }
    return count;
  }
}