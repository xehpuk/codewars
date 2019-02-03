# Range Extraction
[*View on Codewars*](https://www.codewars.com/kata/range-extraction)

A format for expressing an ordered list of integers is to use a comma separated list of either

* individual integers
* or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'. The range includes all integers in the interval including both endpoints.  It is not considered a range unless it spans at least 3 numbers. For example ("12, 13, 15-17")

Complete the solution  so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format. 

**Example:**

```javascript
solution([-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20]);
// returns "-6,-3-1,3-5,7-11,14,15,17-20"
```

```coffeescript
solution([-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20])
# returns "-6,-3-1,3-5,7-11,14,15,17-20"
```

```ruby
solution([-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20])
# returns "-6,-3-1,3-5,7-11,14,15,17-20"
```

```python
solution([-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20])
# returns "-6,-3-1,3-5,7-11,14,15,17-20"
```

```java
Solution.rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
# returns "-6,-3-1,3-5,7-11,14,15,17-20"
```

```C#
RangeExtraction.Extract(new[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20});
# returns "-6,-3-1,3-5,7-11,14,15,17-20"
```
```cpp
range_extraction({-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20});
// returns "-6,-3-1,3-5,7-11,14,15,17-20"
```

*Courtesy of rosettacode.org*


## Timeline
- Created: 2013-06-14
- Published: 2013-06-14
- Approved: null
- Completed: 2019-01-26