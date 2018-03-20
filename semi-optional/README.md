# Semi-Optional
[*View on Codewars*](https://www.codewars.com/kata/semi-optional)

We have implemented a function wrap(value) that takes a value of arbitrary type and wraps it in a new Javascript Object setting  the 'value' key on the new Object to the passed-in value.

So, for example, if we execute the following code:

```javascript 
var wrappedObj = wrap("MyWrappedString"); 
 // wrappedObject should be  {"value":"MyWrappedString"}
```
We would then expect the following statement to be true:

```javascript 
wrappedObj.value === "MyWrappedString"
```
Unfortunately, the code is not working as designed. Please fix the code so that it behaves as specified.



## Timeline
- Created: 2013-08-27
- Published: 2013-08-27
- Approved: null
- Completed: 2016-09-08