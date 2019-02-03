# Find the missing term in an Arithmetic Progression
[*View on Codewars*](https://www.codewars.com/kata/find-the-missing-term-in-an-arithmetic-progression)

An Arithmetic Progression is defined as one in which there is a constant difference between the consecutive terms of a given series of numbers. You are provided with consecutive elements of an Arithmetic Progression. There is however one hitch: exactly one term from the original series is missing from the set of numbers which have been given to you. The rest of the given series is the same as the original AP.  Find the missing term.  

You have to write the function findMissing(list), list will always be at least 3 numbers. The missing term will never be the first or last one.

## Example
```php
findMissing([1, 3, 5, 9, 11]) == 7
```
```csharp
Kata.FindMissing(new List<int> {1, 3, 5, 9, 11}) => 7
```
```fsharp
findMissing [| 1; 3; 5; 9; 11 |] = 7
```
```python
find_missing([1, 3, 5, 9, 11]) == 7
```
```ruby
findMissing([1, 3, 5, 9, 11]) == 7
```
```

PS: This is a sample question of the facebook engineer challenge on interviewstreet.
I found it quite fun to solve on paper using math, derive the algo that way.
Have fun!

## Timeline
- Created: 2014-01-21
- Published: 2014-01-21
- Approved: 2014-01-31
- Completed: 2019-01-26