# Return Specifics from an Object.
[*View on Codewars*](https://www.codewars.com/kata/return-specifics-from-an-object)

Create a function that returns the values of an object which are numbers, and the keys of objects which have methods as values.

- array should return numbers first then all the method names in the order they are in the object
- strings, booleans, arrays should be ignored. 
- if the object is empty, then the array should return the following string: The Object is Empty

Example: 
```javascript
returnSpecifics({a:1,b:'str',c:2,d:true,e:function(a){return a;},f:3})
```
This would return ```
[1,2,3,'e'] 
```

## Timeline
- Created: 2015-03-17
- Published: 2015-03-19
- Approved: 2019-02-02
- Completed: 2019-02-02