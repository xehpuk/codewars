# You only need one - Beginner
[*View on Codewars*](https://www.codewars.com/kata/you-only-need-one-beginner)

You will be given an array `a` and a value `x`. All you need to do is check whether the provided array contains the value.

~~~if:swift
The type of `a` and `x` can be `String` or `Int`.
~~~
~~~if-not:swift
Array can contain numbers or strings. X can be either.
~~~
~~~if:racket
In racket, you'll be given a list instead of an array. If the value is in the list,
return #t instead of another value that is also considered true.
```racket
(contains '(1 2 3) 3) ; returns #t
(contains '(1 2 3) 5) ; returns #f
```
~~~

Return `true` if the array contains the value, `false` if not. 

## Timeline
- Created: 2016-09-04
- Published: 2016-09-04
- Approved: 2017-11-05
- Completed: 2019-01-25