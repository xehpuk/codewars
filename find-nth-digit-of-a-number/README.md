# Find n'th Digit of a Number
[*View on Codewars*](https://www.codewars.com/kata/find-nth-digit-of-a-number)

The function ```findDigit``` takes two numbers as input, ```num``` and ```nth```. It outputs the nth digit of num (counting from right to left).

#Note
- If ```num``` is negative, ignore its sign and treat it as a positive value.
- If ```nth``` is not positive, return -1.
- Keep in mind that 42 = 00042. This means that ```findDigit(42, 5)``` would return 0.

#Examples

``` 
findDigit(5673, 4)     returns 5
findDigit(129, 2)      returns 2
findDigit(-2825, 3)    returns 8
findDigit(-456, 4)     returns 0
findDigit(0, 20)       returns 0
findDigit(65, 0)       returns -1
findDigit(24, -8)      returns -1
```

## Timeline
- Created: 2016-07-05
- Published: 2016-07-06
- Approved: 2016-07-06
- Completed: 2018-03-12