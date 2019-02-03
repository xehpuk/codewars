# Array.diff
[*View on Codewars*](https://www.codewars.com/kata/array-dot-diff)

Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list `a`, which are present in list `b`.

```javascript
array_diff([1,2],[1]) == [2]
```
```ruby
array_diff([1,2],[1]) == [2]
```
```python
array_diff([1,2],[1]) == [2]
```
```coffeescript
array_diff([1,2],[1]) == [2]
```
```haskell
difference [1,2] [1] == [2]
```
```csharp
Kata.ArrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
```
```rust
array_diff(vec![1,2], vec![1]) == vec![2]
```
```clojure
(= (array-diff [1 2] [1]) [2])
```
```groovy
Kata.arrayDiff([1,2],[1]) == [2]
```
```julia
arraydiff([1,2],[1]) == [2]
```
```nim
arrayDiff(@[1,2],@[1]) == @[2]
```
```php
arrayDiff([1,2],[1]) == [2]
```
```r
array_diff(c(1, 2), 1) == 2
```

If a value is present in `b`, all of its occurrences must be removed from the other:

```javascript
array_diff([1,2,2,2,3],[2]) == [1,3]
```
```ruby
array_diff([1,2],[1]) == [2]
```
```python
array_diff([1,2,2,2,3],[2]) == [1,3]
```
```coffeescript
array_diff([1,2,2,2,3],[2]) == [1,3]
```
```haskell
difference [1,2,2,2,3] [2] == [1,3]
```
```csharp
Kata.ArrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
```
```rust
array_diff(vec![1,2,2,2,3], vec![2]) == vec![1,3]
```
```clojure
(= (array-diff [1,2,2,2,3] [2]) [1,3])
```
```groovy
Kata.arrayDiff([1,2,2,2,3],[2]) == [1,3]
```
```julia
arraydiff([1,2,2,2,3],[2]) == [1,3]
```
```nim
arrayDiff(@[1,2,2,2,3],@[2]) == @[1,3]
```
```php
arrayDiff([1,2,2,2,3],[2]) == [1,3]
```
```r
array_diff(c(1, 2, 2, 2, 3), 2) == c(1, 3)
```


## Timeline
- Created: 2013-09-22
- Published: 2013-09-22
- Approved: null
- Completed: 2019-01-26