# 254 shades of grey
[*View on Codewars*](https://www.codewars.com/kata/254-shades-of-grey)

Why would we want to stop to only 50 shades of grey? Let's see to how many we can go. 

Write a function that takes a number n as a parameter and return an array containing n shades of grey in hexadecimal code (`#aaaaaa` for example). The array should be sorted in ascending order starting with `#010101`, `#020202`, etc. (using lower case letters).

```javascript
function shadesOfGrey(n){
  // returns n shades of grey in an array
}
```
```coffeescript
shadesOfGrey = (n) ->
  # returns n shades of grey in an array
```
```haskell
shadesOfGrey :: Int -> [String]
```
```csharp
using System;

public static class Kata {
  public static class ShadesOfGrey(int n) {
    // returns n shades of grey in an array
  }
}
```
```python
def shades_of_grey(n):
  return '''n shades of grey in an array'''
```
```ruby
def shades\_of\_grey(n)
  return '''n shades of grey in an array'''
end
```
```java
public class ShadesOfGrey {
  static String[] shadesOfGrey(int num) {
    // returns n shades of grey in an array
  }
}
```

As a reminder, the grey color is composed by the same number of red, green and blue: `#010101`, `#aeaeae`, `#555555`, etc. Also, `#000000` and `#ffffff` are not accepted values.

When n is negative, just return an empty array.
If n is higher than 254, just return an array of 254 elements.

Have fun



## Timeline
- Created: 2015-02-04
- Published: 2015-02-04
- Approved: 2015-03-10
- Completed: 2015-05-24