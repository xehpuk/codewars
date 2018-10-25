# The highest profit wins!
[*View on Codewars*](https://www.codewars.com/kata/the-highest-profit-wins)

### Story

Ben has a very simple idea to make some profit: he buys something and sells it again. Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price. Instead, he's going to buy it for the lowest possible price and sell it at the highest.

### Task

Write a function that returns both the minimum and maximum number of the given list/array. 

### Examples

```haskell
minMax [1,2,3,4,5] `shouldBe` (1, 5)
minMax [2334454,5] `shouldBe` (5, 2334454)
minMax [1]         `shouldBe` (1, 1)
```
```javascript
minMax([1,2,3,4,5])   == [1,5]
minMax([2334454,5])   == [5, 2334454]
minMax([1])           == [1, 1]
```
```coffeescript
minMax [1..5]      == [1, 5]
minMax [2334454,5] == [5, 2334454]
minMax [1]         == [1, 1]
```
```python
min_max([1,2,3,4,5])   == [1,5]
min_max([2334454,5])   == [5, 2334454]
min_max([1])           == [1, 1]
```
```ruby
min_max([1,2,3,4,5])   == [1,5]
min_max([2334454,5])   == [5, 2334454]
min_max([1])           == [1, 1]
```
```java
MinMax.minMax(new int[]{1,2,3,4,5}) == {1,5}
MinMax.minMax(new int[]{2334454,5}) == {5, 2334454}
MinMax.minMax(new int[]{1}) == {1, 1}
```
```csharp
MinMax.minMax(new int[]{1,2,3,4,5}) == {1,5}
MinMax.minMax(new int[]{2334454,5}) == {5, 2334454}
MinMax.minMax(new int[]{1}) == {1, 1}
```

### Remarks
All arrays or lists will always have at least one element, so you don't need to check the length. Also, your function will always get an array or a list, you don't have to check for `null`, `undefined` or similar.

## Timeline
- Created: 2015-07-02
- Published: 2015-07-02
- Approved: 2015-07-03
- Completed: 2018-09-05