# Sort Numbers
[*View on Codewars*](https://www.codewars.com/kata/sort-numbers)

Finish the solution so that it sorts the passed in array of numbers. If the function passes in an empty array or null/nil value then it should return an empty array.

For example:

```javascript
solution([1, 2, 10, 50, 5]); // should return [1,2,5,10,50]
solution(null); // should return []
```

```typescript
solution([1, 2, 10, 50, 5]); // should return [1, 2, 5, 10, 50]
solution([]); // should return []
```

```coffeescript
solution([1, 2, 10, 50, 5]) # should return [1,2,5,10,50]
solution(null) # should return []
```

```ruby
solution([1, 2, 10, 50, 5]) # should return [1,2,5,10,50]
solution(nil) # should return []
```

```python
solution([1,2,3,10,5]) # should return [1,2,3,5,10]
solution(None) # should return []
```

```csharp
SortNumbers(new int[] { 1, 2, 10, 50, 5 }); // should return new int[] { 1, 2, 5, 10, 50 }
SortNumbers(null); // should return new int[] { }
```

```rust
sort_numbers(&vec![1, 2, 3, 10, 5]); // should return vec![1, 2, 3, 5, 10]
sort_numbers(&vec![]); // should return !vec[]
```

```Hakell
sortNumbers [1, 2, 10, 50, 5] = Just [1, 2, 5, 10, 50]
sortNumbers [] = Nothing
```

## Timeline
- Created: 2013-04-22
- Published: 2013-04-22
- Approved: null
- Completed: 2019-02-05