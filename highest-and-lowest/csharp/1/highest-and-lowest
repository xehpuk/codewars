using System;

public static class Kata
{
  public static string HighAndLow(string numbers)
  {
    var min = int.MaxValue;
    var max = int.MinValue;
    foreach (var number in numbers.Split(' '))
    {
      var n = int.Parse(number);
      min = Math.Min(min, n);
      max = Math.Max(max, n);
    }
    return max + " " + min;
  }
}