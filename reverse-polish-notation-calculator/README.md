# Reverse polish notation calculator
[*View on Codewars*](https://www.codewars.com/kata/reverse-polish-notation-calculator)

Your job is to create a calculator which evaluates expressions in [Reverse Polish notation](http://en.wikipedia.org/wiki/Reverse_Polish_notation).

For example expression `5 1 2 + 4 * + 3 -` (which is equivalent to `5 + ((1 + 2) * 4) - 3` in normal notation) should evaluate to `14`.

Note that for simplicity you may assume that there are always spaces between numbers and operations, e.g. `1   3 +` expression is valid, but `1 3+` isn't.

Empty expression should evaluate to `0`.

Valid operations are `+`, `-`, `*`, `/`.

You may assume that there won't be exceptional situations (like stack underflow or division by zero).

## Timeline
- Created: 2014-02-09
- Published: 2014-02-09
- Approved: 2014-02-24
- Completed: 2015-05-03