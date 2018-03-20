# Java Functional Programming (Part 2: Multiline Functions)
[*View on Codewars*](https://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions)

With the release of Java 8, Java has finally added support for "lambda functions", that is, variables that contain a function which can operate on data just as class methods can (well, not _just_ as class methods can...)

Let's learn about lambdas.

This is part 2 of a 4 part series; the other katas are:

* Part 1: http://www.codewars.com/kata/java-functional-programming-part-1-the-beginning/java
* Part 3: http://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business
* Part 4: http://www.codewars.com/kata/java-functional-programming-part-4-row-row-row-your-boat-gently-down-the-dot-dot-dot

Last time, we did something similar to this:

```java
Function<MyObject, String> f = p -> p.toString();
String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString
```

But what if we need more than one line in our function for the calculations? The syntax to do so is to enclose the function's commands in curly brackets and include a return statement:

```java
Function<MyObject, String> f = p -> {StringBuffer out = new StringBuffer();
                                     out.append(p.getName());
                                     out.append(MyObject.getStaticName());
                                     out.append("Constant message");
                                     return out.toString();
                               };
```

Given this POJO:

```java
public class Triangle {
  public final int height;
  public final int base;
  private double area;
  public void setArea(double a) {
    area = a;
  }
  public double getArea() {
    return area;
  }
}
```

Write a function that sets the area of the given Triangle and returns the area as a `double`. Do not use the function type Function; there is a function type for converting an arbitrary class into a `double`, use that.

The formula for triangle area is: 1/2 \* base \* height

Assume valid input (base and height are both greater than 0).

A full listing of the default function types can be found at http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

(Aside: you may have noticed, the function type we should have used in Part 1 is Predicate, even though we used Function.)

## Timeline
- Created: 2015-01-02
- Published: 2015-01-02
- Approved: 2016-01-15
- Completed: 2016-09-08