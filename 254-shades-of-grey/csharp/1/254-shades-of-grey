using System;

public static class Kata
{
  public static string[] ShadesOfGrey(int n)
  {
    if (n <= 0)
    {
      return new string[0];
    }
    var max = Math.Min(byte.MaxValue - 1, n);
    var shadesOfGrey = new string[max];
    for (int i = 0; i < max; i++)
    {
      var hex = (i + 1).ToString("x2");
      shadesOfGrey[i] = '#' + hex + hex + hex;
    }
    return shadesOfGrey;
  }
}