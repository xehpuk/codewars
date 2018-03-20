# Find something in an Array
[*View on Codewars*](https://www.codewars.com/kata/find-something-in-an-array)

Create a find function that takes a string and an array as arguments. If the string is in the array, return true.

For example:
```javascript
find("hello", ["bye bye","hello"]) // return true
find("anything", ["bye bye","hello"]) // return false
```
```ruby
find("hello", ["bye bye","hello"]) // return true
find("anything", ["bye bye","hello"]) // return false
```
```python
find("hello", ["bye bye","hello"]) # return true
find("anything", ["bye bye","hello"]) # return false
```
```java
NeedleInHaystack.find("hello", new String[]{"bye bye", "hello"})  // return true
// the haystack (searchable array) will never be null, but could contain null values;
NeedleInHaystack.find("be", new String[]{"careful", null, "oops"})  // return false
// also the needle could be null too
NeedleInHaystack.find(null, new String[]{"watch", "for", null})  // return true
```
Note: 
"Hello" !== "hello" // case-sensitive comparison

## Timeline
- Created: 2014-07-27
- Published: 2014-07-27
- Approved: null
- Completed: 2015-05-21