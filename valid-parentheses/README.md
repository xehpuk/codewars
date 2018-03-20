# Valid Parentheses
[*View on Codewars*](https://www.codewars.com/kata/valid-parentheses)

Write a function called that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return `true` if the string is valid, and `false` if it's invalid.

## Examples

```
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true
```

## Constraints

`0 <= input.length <= 100`

~~~if-not:javascript,go
Along with opening (`(`) and closing (`)`) parenthesis, input may contain any valid ASCII characters.  Furthermore, the input string may be empty and/or not contain any parentheses at all.  Do **not** treat other forms of brackets as parentheses (e.g. `[]`, `{}`, `<>`).
~~~

~~~if:javascript,go
You may assume that the input string will *only* contain opening and closing parenthesis and *will not* be an empty string.
~~~

## Timeline
- Created: 2013-11-04
- Published: 2013-11-04
- Approved: null
- Completed: 2015-05-25