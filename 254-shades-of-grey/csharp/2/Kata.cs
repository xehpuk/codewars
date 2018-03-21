using System.Linq;

public static class Kata
{
  public static string[] ShadesOfGrey(int n)
  {
    return Enumerable
      .Range(1, byte.MaxValue - 1)
      .Take(n)
      .Select(i => i.ToString("x2"))
      .Select(x => '#' + x + x + x)
      .ToArray();
  }
}