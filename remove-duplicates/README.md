# Remove Duplicates
[*View on Codewars*](https://www.codewars.com/kata/remove-duplicates)

# Remove Duplicates

You are to write a function called `unique` that takes an array of integers and returns the array with duplicates removed. It must return the values in the same order as first seen in the given array. Thus no sorting should be done, if 52 appears before 10 in the given array then it should also be that 52 appears before 10 in the returned array.

## Assumptions

* All values given are integers (they can be positive or negative).
* You are given an array but it may be empty.
* They array may have duplicates or it may not.
* You cannot use the `uniq` method on Arrays (don't even try it), or the `nub` function from `Data.List`.

## Example

```ruby
puts unique([1, 5, 2, 0, 2, -3, 1, 10]).inspect
[1, 5, 2, 0, -3, 10]

puts unique([]).inspect
[]

puts unique([5, 2, 1, 3]).inspect
[5, 2, 1, 3]
```
```coffeescript
unique([1, 5, 2, 0, 2, -3, 1, 10])
# -> [1, 5, 2, 0, -3, 10]

unique([])
# -> []

unique([5, 2, 1, 3])
# -> [5, 2, 1, 3]
```
```java
UniqueArray.unique([1, 5, 2, 0, 2, -3, 1, 10]) 
// -> [1, 5, 2, 0, -3, 10]
```
```haskell
λ unique [1,5,2,0,2,-3,1,10]
[1,5,2,0,-3,10]
```
```python
print unique([1, 5, 2, 0, 2, -3, 1, 10])
[1, 5, 2, 0, -3, 10]

print unique([])
[]

print unique([5, 2, 1, 3])
[5, 2, 1, 3]
```


## What We Are Testing

We are testing basic array usage and knowledge. There are many ways to solve this and advanced users may find faster ways to solve this.

## Timeline
- Created: 2014-08-07
- Published: 2014-08-07
- Approved: 2014-10-07
- Completed: 2015-04-29