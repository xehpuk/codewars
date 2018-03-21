using System.Linq;

public class CandyProblem
{
  public static int GetMissingCandies(int[] candies)
  {
    var length = candies.Length;
    return length <= 1 ? -1 : candies.Max() * length - candies.Sum();
  }
}