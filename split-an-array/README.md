# Split an array
[*View on Codewars*](https://www.codewars.com/kata/split-an-array)

Split an array of objects into 2 arrays based on truthiness of a provided property.  The return value should be an array whose first element is an array of the truthy values, and whose second element is an array of the falsey values.

Javascript example:
```js
var obj1 = { prop: true },
    obj2 = { prop: false };
    
split([obj1, obj2], 'prop');
// [[obj1], [obj2]]
```

CoffeeScript example:
``` coffee
obj1 = { prop: true }
obj2 = { prop: false }

split [obj1, obj2], 'prop'
# [[obj1], [obj2]]
```

## Timeline
- Created: 2015-03-19
- Published: 2015-03-19
- Approved: 2019-02-12
- Completed: 2015-05-23