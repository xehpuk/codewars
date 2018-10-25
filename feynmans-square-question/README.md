# Feynman's square question
[*View on Codewars*](https://www.codewars.com/kata/feynmans-square-question)

# Feynman's squares
Richard Phillips Feynman was a well-known American physicist and a recipient of the Nobel Prize in Physics. He worked in theoretical physics and pioneered the field of quantum computing.

Recently, an old farmer found some papers and notes that are believed to have belonged to Feynman. Among notes about mesons and electromagnetism, there was a napkin where he wrote a simple puzzle: "how many different squares are there in a grid of NxN squares?".

For example, when N=2, the answer is 5: the 2x2 square itself, plus the four 1x1 squares in its corners:

<img src=http://www.spoj.com/content/disatoba:feynman.gif>

# Task

You have to write a function

```haskell
countSquares :: Integer -> Integer
```
```javascript
function countSquares(n){ â€¦ }
```
```ruby
def count_squares(n)
```
```python
def count_squares(n):
```

that solves Feynman's question in general. The input to your function will always be a positive integer.

#Examples

```haskell
countSquares 1 =  1
countSquares 2 =  5
countSquares 3 = 14
```
```ruby
count_squares(1) =  1
count_squares(2) =  5
count_squares(3) = 14
```
```python
count_squares(1) =  1
count_squares(2) =  5
count_squares(3) = 14
```
```javascript
countSquares(1) =  1
countSquares(2) =  5
countSquares(3) = 14
```


(Adapted from the Sphere Online Judge problem SAMER08F by Diego Satoba)

## Timeline
- Created: 2015-03-24
- Published: 2015-03-24
- Approved: 2015-04-02
- Completed: 2015-05-24