# Smallest value of an array
[*View on Codewars*](https://www.codewars.com/kata/smallest-value-of-an-array)

Write a function that can return the smallest value of an array or the index of that value. The function's 2nd parameter will tell whether it should return the value or the index.

Assume the first parameter will always be an array filled with at least 1 number and no duplicates. Assume the second parameter will be a string holding one of two values: 'value' and 'index'.

```javascript
min([1,2,3,4,5], 'value') // => 1
min([1,2,3,4,5], 'index') // => 0
```

```java
Arrays.findSmallest(new int[]{1,2,3,4,5}, 'value') // => 1
Arrays.findSmallest(new int[]{1,2,3,4,5}, 'index') // => 0
```

```C#
Kata.FindSmallest(new int[]{ 1, 2 , 3, 4, 5}, "value") // => 1
Kata.FindSmallest(new int[]{ 1, 2 , 3, 4, 5}, "index") // => 0
```

## Timeline
- Created: 2014-10-24
- Published: 2014-10-24
- Approved: 2014-11-05
- Completed: 2015-05-11