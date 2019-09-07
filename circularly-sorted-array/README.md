# Circularly Sorted Array
[*View on Codewars*](https://www.codewars.com/kata/circularly-sorted-array)

Write a method, isCircleSorted(int[] A) (**Java**, **JavaScript**), or Array#circularly_sorted? (**Ruby**) that determines if A is
circularly sorted. An Array is circularly sorted if the elements are
sorted in ascending order, but displaced, or rotated, by any number of steps. 

For Example:

```java
// True:
isCircleSorted([2,3,4,5,0,1]);
isCircleSorted([4,5,6,9,1]);
isCircleSorted([10,11,6,7,9]);
isCircleSorted([1,2,3,4,5]);
isCircleSorted([5,7,43,987,-9,0]);


// False:
isCircleSorted([4,1,2,5]);
isCircleSorted([8,7,6,5,4,3]);
isCircleSorted([6,7,4,8]);
isCircleSorted([7,6,5,4,3,2,1]);
```
```javascript
// True:
isCircleSorted([2,3,4,5,0,1]);
isCircleSorted([4,5,6,9,1]);
isCircleSorted([10,11,6,7,9]);
isCircleSorted([1,2,3,4,5]);
isCircleSorted([5,7,43,987,-9,0]);


// False:
isCircleSorted([4,1,2,5]);
isCircleSorted([8,7,6,5,4,3]);
isCircleSorted([6,7,4,8]);
isCircleSorted([7,6,5,4,3,2,1]);
```
```php
// True:
isCircleSorted([2,3,4,5,0,1]);
isCircleSorted([4,5,6,9,1]);
isCircleSorted([10,11,6,7,9]);
isCircleSorted([1,2,3,4,5]);
isCircleSorted([5,7,43,987,-9,0]);

// False:
isCircleSorted([4,1,2,5]);
isCircleSorted([8,7,6,5,4,3]);
isCircleSorted([6,7,4,8]);
isCircleSorted([7,6,5,4,3,2,1]);
```
```ruby
[2, 3, 4, 5, 0, 1].circularly_sorted? # true
[5, 4, 0, 1, 2, 3].circularly_sorted? # false
```

## Timeline
- Created: 2014-10-23
- Published: 2014-10-23
- Approved: 2014-12-28
- Completed: 2015-04-29