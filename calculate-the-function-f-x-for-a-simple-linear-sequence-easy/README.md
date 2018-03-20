# Calculate the function f(x) for a simple linear sequence (Easy)
[*View on Codewars*](https://www.codewars.com/kata/calculate-the-function-f-x-for-a-simple-linear-sequence-easy)

For any given linear sequence, calculate the function [f(x)] and return it as a string.

For example:
```javascript
getFunction([0, 1, 2, 3, 4]) => "f(x) = x"
getFunction([0, 3, 6, 9, 12]) => "f(x) = 3x"
getFunction([1, 4, 7, 10, 13]) => "f(x) = 3x + 1"
```
```ruby
get_function([0, 1, 2, 3, 4]) => "f(x) = x"
get_function([0, 3, 6, 9, 12]) => "f(x) = 3x"
get_function([1, 4, 7, 10, 13]) => "f(x) = 3x + 1"
```
```python
get_function([0, 1, 2, 3, 4]) => "f(x) = x"
get_function([0, 3, 6, 9, 12]) => "f(x) = 3x"
get_function([1, 4, 7, 10, 13]) => "f(x) = 3x + 1"
```
```haskell
getFunction [0, 1, 2, 3, 4]   `shouldBe` Just "f(x) = x"
getFunction [0, 3, 6, 9, 12]  `shouldBe` Just "f(x) = 3x"
getFunction [1, 4, 7, 10, 13] `shouldBe` Just "f(x) = 3x + 1"
getFunction [0, 0, 1, 1, 1]   `shouldBe` Nothing -- not linear
```

Assumptions for this kata are:

- the sequence argument will always contain 5 values equal to f(0) - f(4).
- the function will always be in the format "nx +/- m", 'x +/- m', 'nx', 'x' or 'm'
- if a non-linear sequence simply return 'Non-linear sequence' or `Nothing` in Haskell.


## Timeline
- Created: 2014-11-27
- Published: 2014-11-27
- Approved: 2014-12-08
- Completed: 2015-05-24