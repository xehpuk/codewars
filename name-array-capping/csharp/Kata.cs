using System.Globalization;
using System.Linq;

public static class Kata
{
  public static string[] CapMe(string[] strings)
  {
    var info = CultureInfo.CurrentCulture.TextInfo;
    return strings.Select(s => info.ToLower(s))
                  .Select(s => info.ToTitleCase(s))
                  .ToArray();
  }
}