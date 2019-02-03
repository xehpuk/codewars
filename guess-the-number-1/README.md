# Guess the number!
[*View on Codewars*](https://www.codewars.com/kata/guess-the-number-1)

The `Guesser` class is set up to generate a random number from 1-1000, and allows 10 guesses to get the number.

Your task is to write a method '`get_number`' (`Guesser.prototype.getNumber()` in javascript) inside the `Guesser` class (or its derived class in Java) to identify a random number from 1-1000.

You should use the method:
```ruby
guess number
```
```javascript
this.guess(number)
```
```java
guess(number)
```
Which will return either:
```
"Too high!" If the guess is too high.
"Too low!" If the guess is too low.
or "Correct!" If the guess is correct.
```

You can only call this method 10 times before an exception is raised.


## Timeline
- Created: 2014-10-30
- Published: 2014-10-30
- Approved: 2014-11-24
- Completed: 2015-04-29