# Are the numbers in order?
[*View on Codewars*](https://www.codewars.com/kata/are-the-numbers-in-order)

# Are the numbers in order?

In this Kata, your function receives an array of positive integers as input.  Your task is to determine whether the numbers are in **ascending** order.

For the purposes of this Kata, you may assume that all inputs are valid (i.e. arrays containing only positive integers with a length of at least 2).

For example:

```js
inAscOrder([1,2,4,7,19]); // returns true
inAscOrder([1,2,3,4,5]); // returns true
inAscOrder([1,6,10,18,2,4,20]); // returns false
inAscOrder([9,8,7,6,5,4,3,2,1]); // returns false because the numbers are in DESCENDING order
```

```csharp
Kata.IsAscOrder(new int[]{1,2,4,7,19}) == true
Kata.IsAscOrder(new int[]{1,2,3,4,5}) == true
Kata.IsAscOrder(new int[]{1,6,10,18,2,4,20}) == false
Kata.IsAscOrder(new int[]{9,8,7,6,5,4,3,2,1}) == false // numbers are in DESCENDING order
```

```python
in_asc_order([1,2,4,7,19]) # returns True
in_asc_order([1,2,3,4,5]); // returns True
in_asc_order([1,6,10,18,2,4,20]) # returns False
in_asc_order([9,8,7,6,5,4,3,2,1]) # returns False because the numbers are in DESCENDING order
```

```php
in_asc_order([1, 2, 4, 7, 19]); // true
in_asc_order([1, 2, 3, 4, 5]); // true
in_asc_order([1, 6, 10, 18, 2, 4, 20]); // false
in_asc_order([9, 8, 7, 6, 5, 4, 3, 2, 1]); // false (NOTE: because the numbers are in DESCENDING order, not ascending order)
```

**Extra Challenge: If time, try to optimise and shorten your code as much as possible.**

## Timeline
- Created: 2016-02-08
- Published: 2016-02-08
- Approved: 2016-02-09
- Completed: 2016-09-08