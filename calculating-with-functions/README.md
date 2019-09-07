# Calculating with Functions
[*View on Codewars*](https://www.codewars.com/kata/calculating-with-functions)

This time we want to write calculations using functions and get the results. Let's have a look at some examples:

```javascript
seven(times(five())); // must return 35
four(plus(nine())); // must return 13
eight(minus(three())); // must return 5
six(dividedBy(two())); // must return 3
```
```ruby
seven(times(five)) # must return 35
four(plus(nine)) # must return 13
eight(minus(three)) # must return 5
six(divided_by(two)) # must return 3
```
```python
seven(times(five())) # must return 35
four(plus(nine())) # must return 13
eight(minus(three())) # must return 5
six(divided_by(two())) # must return 3
```

Requirements:

* There must be a function for each number from 0 ("zero") to 9 ("nine")
* There must be a function for each of the following mathematical operations: plus, minus, times, dividedBy (`divided_by` in Ruby and Python)
* Each calculation consist of exactly one operation and two numbers
* The most outer function represents the left operand, the most inner function represents the right operand
* Divison should be **integer division**. For example, this should return `2`, not `2.666666...`:

```javascript
eight(dividedBy(three()));
```
```ruby
eight(divided_by(three))
```
```python
eight(divided_by(three()))
```

## Timeline
- Created: 2013-10-17
- Published: 2013-10-17
- Approved: 2013-12-22
- Completed: 2018-09-05