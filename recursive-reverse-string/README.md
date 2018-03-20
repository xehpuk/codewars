# Recursive reverse string
[*View on Codewars*](https://www.codewars.com/kata/recursive-reverse-string)

##Do you know how to write a recursive function? Let's test it!
---

*
Definition: Recursive function is a function that calls itself during its execution
*
```
Classic factorial counting on Javascript
function factorial(n) {
  return n <= 1 ? 1 : n * factorial(n-1) 
}

```

---
Your objective is to complete a recursive function `reverse()` that receives `str` as String and returns the same string in reverse order

Rules:

- reverse function should be executed only N times. `N = length of the input string`
- helper functions are not allowed
- changing the signature of the function is not allowed


Examples:
```
reverse("hello world") = "dlrow olleh" (N = 11)
reverse("abcd") = "dcba" (N = 4)
reverse("12345") = "54321" (N = 5)
```

<i>All tests for this Kata are randomly generated, besides checking the reverse logic they will count how many times the reverse() function has been executed. <i>

<font color="red">
Please note that tests for `js` and `coffeescript` and `Java "Hello world"` show  wrong messages.
<br>
Expected and Actual values should be swapped. 
<br>
Unfortunately Test Cases section is blocked for editing and can be changed only by moderator.
</font>

## Timeline
- Created: 2014-05-07
- Published: 2014-05-07
- Approved: 2014-11-24
- Completed: 2016-09-08