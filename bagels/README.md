# Bagels
[*View on Codewars*](https://www.codewars.com/kata/bagels)

Here's a seemingly simple challenge. We're giving you a class called bagel, exactly as it appears below. All it really does is return an int, specifically 3.

```csharp
sealed class Bagel {
    public int Value { get; private set; } = 3;
}
```
```kotlin
class Bagel {
	val value: Int get() = 3
}
```
```scala
class Bagel {
  final def getValue = 3
}
```
```java
public class Bagel {
    public final int getValue() {
        return 3;
    }
}
```
```groovy
class Bagel {
	final int getValue() {
		3
	}
}
```

The catch? For the solution, we're testing that the result is equal to 4. But as a little hint, the solution to this Kata is (almost) exactly the same as the example test cases.

## Timeline
- Created: 2015-01-19
- Published: 2015-01-19
- Approved: 2016-10-09
- Completed: 2015-05-09