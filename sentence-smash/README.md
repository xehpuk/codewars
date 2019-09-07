# Sentence Smash
[*View on Codewars*](https://www.codewars.com/kata/sentence-smash)

# Sentence Smash

Write a method `smash` that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. **Be careful, there shouldn't be a space at the beginning or the end of the sentence!**

## Example

```javascript
var words = ['hello', 'world', 'this', 'is', 'great'];
smash(words); // returns "hello world this is great"
```
```php
smash(['hello', 'world', 'this', 'is', 'great']); // => 'hello world this is great'
```
```dart
smash(['hello', 'world', 'this', 'is', 'great']); // => 'hello world this is great'
```
```python
words = ['hello', 'world', 'this', 'is', 'great']
smash(words) # returns "hello world this is great"
```
```ruby
words = ['hello', 'world', 'this', 'is', 'great']
smash(words) # returns "hello world this is great"
```
```haskell
smash ["hello", "world", "this", "is", "great"] `shouldBe` "hello world this is great"
```
```elixir
words = ["hello", "world", "this", "is", "great"]
smash(words) # returns "hello world this is great"
```
```csharp
Kata.Smash(new string[] {"hello", "world", "this", "is", "great"}) => "hello world this is great";
```
```r
words = c("hello", "world", "this", "is", "great")
smash(words)
[1] "hello world this is great"
```
```julia
words = ["hello", "world", "this", "is", "great"]
smash(words) # returns "hello world this is great"
```
```racket
;; use a list intead of an array in racket
(define words '("hello" "world" "this" "is" "great"))
(smash words) ; returns "hello world this is great"
```
## Assumptions

* You can assume that you are only given words.
* You cannot assume the size of the array.
* You can assume that you will always get an array.

## What We're Testing

We're testing basic loops and string manipulation. This is for beginners who are just learning loops and string manipulation.

## Disclaimer

This is for beginners so we want to test basic loops and string manipulation. Advanced users should easily be able to do this in one line.

## Timeline
- Created: 2014-08-01
- Published: 2014-08-01
- Approved: 2014-08-08
- Completed: 2015-05-15