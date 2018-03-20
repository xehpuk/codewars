# Deep comparison of objects
[*View on Codewars*](https://www.codewars.com/kata/deep-comparison-of-objects)

Comparing objects is not an easy task in JavaScript. The comparison operator only returns true if both variables point to the same object, that's why two objects with the same properties and values are different for JavaScript, like this:

```javascript
var a = { name: 'Joe' };
var b = { name: 'Joe' };
a == b;  //-> false
```

Sometimes it's really useful to detect when two objects have the same values.

Your task is to develop the deepCompare function to test if two objects have the same properties and values. Remember that an object can contain other objects. The function should also be able to correctly compare simple values, like strings and numbers (without using type coercion, please).

To make things simpler, it will only have to deal with simple values and objects and arrays containing strings, booleans and numbers, without taking into account regular expressions, dates and functions.

## Timeline
- Created: 2014-07-13
- Published: 2014-07-13
- Approved: 2015-02-26
- Completed: 2015-05-24