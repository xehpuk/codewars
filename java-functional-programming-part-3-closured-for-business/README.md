# Java Functional Programming (Part 3: Closured for Business)
[*View on Codewars*](https://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business)

With the release of Java 8, Java has finally added support for "lambda functions", that is, variables that contain a function which can operate on data just as class methods can (well, not _just_ as class methods can...)

Let's learn about lambdas. This is part 3 in a series of 4.

* Part 1: http://www.codewars.com/kata/java-functional-programming-part-1-the-beginning/java
* Part 2: http://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions
* Part 4: http://www.codewars.com/kata/java-functional-programming-part-4-row-row-row-your-boat-gently-down-the-dot-dot-dot

We've now got a handle on Java lambda functions (even multi-line ones), but do Java lambdas have all the features of scripting functions? Like closures?

Yes. And, like in every language that supports them, closures give people headaches. Let's learn about closures!

## What is a closure?

In programming, a closure is a function that retains the context in which it was created.

_What._

Okay, say we have these statements:

```java
int foo = 5;
Function<String, Integer> f = s -> s.length + foo;
f.apply("somestring"); //Should be 15
```

Given an input of "somestring", f should return 15. But what happens when f leaves this context?

```java
public void someMethod() {
  int foo = 5;
  Function<String, Integer> f = s -> s.length + foo;
  f.apply("somestring"); //Should be 15
  sendMethod(f);
}
public void sendMethod(Function<String, Integer> f) {
  f.apply("otherstring"); //Should return 16
}
```

Does f still know foo is 5 when f is in sendMethod? foo is a local variable to someMethod, after all. Yes, f knows 5 is 5; that's what closures do.

Write a factory that creates adder functions. Depending on what is passed to the create method, the function will, when called, add that amount to another amount given to the function. In other words:

```java
f = AdderFactory.create(1); //Adds 1 to everything
f.applyAsInt(4) == 5;
f.applyAsInt(10) == 11;
f.applyAsInt(-5) == -4;
```

A full listing of the default function types can be found at http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

As in Part 2, don't use the default Function class, but the most appropriate class: the one that takes an int and returns an int; you shouldn't need to use any generics.

## Timeline
- Created: 2015-01-02
- Published: 2015-01-02
- Approved: 2016-01-15
- Completed: 2016-09-08