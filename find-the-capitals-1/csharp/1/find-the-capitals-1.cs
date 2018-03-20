using System.Collections.Generic;

public static class Kata
{
  public static int[] Capitals(string word)
  {
    var capitals = new List<int>();
    for (int i = 0, l = word.Length; i < l; i++)
    {
      var c = word[i];
      if (c != char.ToLower(c)) {
        capitals.Add(i);
      }
    }
    return capitals.ToArray();
  }
}