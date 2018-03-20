# Rectangle into Squares
[*View on Codewars*](https://www.codewars.com/kata/rectangle-into-squares)

The drawing below gives an idea of how to cut a given "true" rectangle into squares ("true" rectangle meaning that the two dimensions are different).

![alternative text](http://i.imgur.com/lk5vJ7sm.jpg)

Can you translate this drawing into an algorithm?

You will be given two dimensions 

1. a positive integer length (parameter named `lng`)
2. a positive integer width (parameter named `wdth`)

You will return an array with the size of each of the  squares.

Shell bash returns a string.


```python
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```crystal
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```elixir
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```php
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```ruby
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```javascript
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```typescript
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```coffeescript
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```clojure
  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]
```
```haskell
squaresInRect  5  3 `shouldBe` Just [3,2,1,1]
squaresInRect  3  5 `shouldBe` Just [3,2,1,1]
squaresInRect 20 14 `shouldBe` Just [14, 6, 6, 2, 2, 2]
```
```fsharp
squaresInRect  5  3 should return Some [3,2,1,1]
squaresInRect  3  5 should return Some [3,2,1,1]
squaresInRect 20 14 should return Some [14, 6, 6, 2, 2, 2]
```
```swift
squaresInRect  5  3 should return [3,2,1,1] as optional
squaresInRect  3  5 should return [3,2,1,1] as optional
squaresInRect 20 14 should return [14, 6, 6, 2, 2, 2] as optional
```
```java
  sqInRect(5, 3) should return a List<Integer> {3, 2, 1, 1}
  sqInRect(3, 5) should return a List<Integer> {3, 2, 1, 1}
```
```csharp
  sqInRect(5, 3) should return a List<int> {3, 2, 1, 1}
  sqInRect(3, 5) should return a List<int> {3, 2, 1, 1}
```
```cpp
  sqInRect(5, 3) should return {3, 2, 1, 1}
  sqInRect(3, 5) should return {3, 2, 1, 1}
```
```c
C returns a structure, see the "Solution" and "Examples" tabs.
Your result and the reference test solution are compared by strings.
```

#Note:
lng == wdth as a starting case would be an entirely different problem and the drawing is planned to be interpreted with lng != wdth. See kata, [Square into Squares. Protect trees!](http://www.codewars.com/kata/54eb33e5bc1a25440d000891).

When the initial parameters are so that `lng` == `wdth`, the solution `[lng]` would be the most obvious but not in the spirit of this kata so, in that case, return `None`/`nil`/`null`/`Nothing. Return {} with C++`. Return the string `"nil"` with Bash.

In that case the returned structure of **C** will have its `sz` component equal to `0`.
(See the "Solution" and "Examples" tabs)


```python
  sqInRect(5, 5) should return None
```
```ruby
  sqInRect(5, 5) should return nil
```
```crystal
  sqInRect(5, 5) should return nil
```
```elixir
  sqInRect(5, 5) should return nil
```
```javascript
  sqInRect(5, 5) should return null
```
```php
  sqInRect(5, 5) should return null
```
```typescript
  sqInRect(5, 5) should return null
```
```coffeescript
  sqInRect(5, 5) should return null
```
```clojure
  sqInRect(5, 5) should return nil
```
```java
  sqInRect(5, 5) should return null
```
```csharp
  sqInRect(5, 5) should return null
```
```cpp
  sqInRect(5, 5) should return {}
```
```haskell
squaresInRect 5 5 `shouldBe` Nothing
```
```fsharp
squaresInRect 5 5 should return None
```
```swift
squaresInRect 5 5 should return nil
```

## Timeline
- Created: 2015-05-03
- Published: 2015-05-03
- Approved: 2015-05-08
- Completed: 2015-05-14