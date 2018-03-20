# Precise fractions pt. 1 - basics
[*View on Codewars*](https://www.codewars.com/kata/precise-fractions-pt-1-basics)

This kata is part one of precise fractions series (see pt. 2: http://www.codewars.com/kata/precise-fractions-pt-2-conversion).

When dealing with fractional values, there's always a problem with the precision of arithmetical operations. So lets fix it!

Your task is to implement class ```Fraction``` that takes care of simple fraction arithmetics. Requirements:

* class must have two-parameter constructor `Fraction(numerator, denominator)`; passed values will be non-zero integers, and may be positive or negative.
* two conversion methods must be supported:
 * `toDecimal()` returns decimal representation of fraction
 * `toString()` returns string with fractional representation of stored value in format:

    [ SIGN ] [ WHOLES ] [ NUMERATOR / DENOMINATOR ]
   * **Note**: each part is returned only if it is available and non-zero, with the only possible space character going between WHOLES and fraction. Examples: '-1/2', '3', '-5 3/4'
    
* The fractional part must always be normalized (ie. the numerator and denominators must not have any common divisors).
* Four operations need to be implemented: `add`, `subtract`, `multiply` and `divide`. Each of them may take integers as well as another `Fraction` instance as an argument, and must return a new `Fraction` instance.
* Instances must be immutable, hence none of the operations may modify either of the objects it is called upon, nor the passed argument.
 
 #### Python Notes
* If one integer is passed into the initialiser, then the fraction should be assumed to represent an integer not a fraction.
* You must implement the standard operator overrides `__add__`, `__sub__`, `__mul__`, `__div__`, in each case you should support `other` being an `int` or another instance of `Fraction`.
* Implement `__str__` and `to_decimal` in place of `toString` and `toDecimal` as described above.

## Timeline
- Created: 2015-02-02
- Published: 2015-02-03
- Approved: 2016-09-07
- Completed: 2015-05-16