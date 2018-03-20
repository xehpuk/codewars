# Re-open class
[*View on Codewars*](https://www.codewars.com/kata/re-open-class)

Ruby and Javascript let you re-open classes so you can add new functionalities to existing classes and objects.

To demonstrate this, you'll have to add a new method (called `my_new_method` in Ruby or `myNewMethod` in JS) into the `String` class that simply calls the `upcase` method (`toUpperCase()` in Javascript), so that:

Ruby
```ruby
"abc".my_new_method
```
JS
```javascript
"abc".myNewMethod();
```

returns 

```
"ABC"
```

## Timeline
- Created: 2014-07-28
- Published: 2014-07-28
- Approved: 2015-02-02
- Completed: 2015-05-24