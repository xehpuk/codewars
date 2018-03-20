# Largest Difference in Increasing Indexes
[*View on Codewars*](https://www.codewars.com/kata/largest-difference-in-increasing-indexes)

*Summary*: Write a function which takes an array `data` of numbers and returns the largest difference in indexes `j - i` such that `data[i] <= data[j]`

--------------------
*Long Description*:

 The `largestDifference` takes an array of numbers. That array is not sorted. Do not sort it or change the order of the elements in any way, or their values.
 
Consider all of the pairs of numbers in the array where the first one is less than or equal to the second one.

From these, find a pair where their positions in the array are farthest apart.

Return the difference between the indexes of the two array elements in this pair.

--------------------

*Example*:

```coffeescript
largestDifference([1,2,3]) # returns 2, because here j = 2 and i = 0 and 2 - 0 = 2
```

```javascript
largestDifference([1,2,3]) ; // returns 2, because here j = 2 and i = 0 and 2 - 0 = 2
```

```clojure
(largestDifference [1 2 3]) ; returns 2, because here j = 2 and i = 0 and 2 - 0 = 2
```

```java
LargestDifference.largestDifference(new int[]{1,2,3}); //returns 2,
//because here j = 2 and i = 0 and 2 - 0 = 2
```

## Timeline
- Created: 2013-10-05
- Published: 2013-10-05
- Approved: 2014-02-17
- Completed: 2015-05-24