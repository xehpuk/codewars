# Remove the minimum
[*View on Codewars*](https://www.codewars.com/kata/remove-the-minimum)

# The museum of incredible dull things

The museum of incredible dull things wants to get rid of some exhibitions. Miriam, the interior architect, comes up with a plan to remove the most boring exhibitions. She gives them a rating, and then removes the one with the lowest rating.

However, just as she finished rating all exhibitions, she's off to an important fair, so she asks you to write a program that tells her the ratings of the items after one removed the lowest one. Fair enough.

# Task

Given an array of integers, remove the smallest value. <span style="color:red">**Do not mutate the original array/list**</span>. If there are multiple elements with the same value, remove the one with a lower index. If you get an empty array/list, return an empty array/list.

Don't change the order of the elements that are left.

### Examples

```haskell
removeSmallest [1,2,3,4,5] = [2,3,4,5]
removeSmallest [5,3,2,1,4] = [5,3,2,4]
removeSmallest [2,2,1,2,1] = [2,2,2,1]
```
```coffeescript
removeSmallest [1,2,3,4,5] = [2,3,4,5]
removeSmallest [5,3,2,1,4] = [5,3,2,4]
removeSmallest [2,2,1,2,1] = [2,2,2,1]
```
```javascript
removeSmallest([1,2,3,4,5]) = [2,3,4,5]
removeSmallest([5,3,2,1,4]) = [5,3,2,4]
removeSmallest([2,2,1,2,1]) = [2,2,2,1]
```
```python
remove_smallest([1,2,3,4,5]) = [2,3,4,5]
remove_smallest([5,3,2,1,4]) = [5,3,2,4]
remove_smallest([2,2,1,2,1]) = [2,2,2,1]
```
```ruby
remove_smallest([1,2,3,4,5]) = [2,3,4,5]
remove_smallest([5,3,2,1,4]) = [5,3,2,4]
remove_smallest([2,2,1,2,1]) = [2,2,2,1]
```
```csharp
Remover.RemoveSmallest(new List<int>{1,2,3,4,5}) = new List<int>{2,3,4,5}
Remover.RemoveSmallest(new List<int>{5,3,2,1,4}) = new List<int>{5,3,2,4}
Remover.RemoveSmallest(new List<int>{2,2,1,2,1}) = new List<int>{2,2,2,1}
```
```r
remove_smallest(c(1, 2, 3, 4, 5)) 
[1] 2 3 4 5
remove_smallest(c(5, 3, 2, 1, 4))
[1] 5 3 2 4
remove_smallest(c(2, 2, 1, 2, 1))
[1] 2 2 2 1
remove_smallest(integer(0))       # If you pass an empty vector (length = 0)
integer(0)                        # You get an empty vector
```



## Timeline
- Created: 2015-11-06
- Published: 2015-11-06
- Approved: 2016-01-15
- Completed: 2018-12-27