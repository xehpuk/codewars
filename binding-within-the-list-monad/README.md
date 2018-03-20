# Binding within the List Monad
[*View on Codewars*](https://www.codewars.com/kata/binding-within-the-list-monad)

In Haskell, _Monads_ are simple containers, or even 'box-like' datastructures, of which lists are included, which can respond to certain functions, which are defined in the Monad typeclass. (To put it simply!)

In this kata, you must implement the __Bind__ function for lists, or arrays. In haskell, the function is represented by `>>=`, but we'll just call it `bind`.

Essentially, `bind` should map the array with the function given, and then flatten it one time. Don't manipulate the original array; make you function _pure_: without side-effects, so that no variables are edited whilst the function is carried out.

Here's how it should work:

```coffeescript
bind( [1,2,3], (a) -> [a+1] )
=> [2,3,4]

bind( [1,2,3], (a) -> [[a]] )
=> [[1],[2],[3]]

bind( [1,2,3], (a) -> a )
=> # ERROR! The returned value is not a list!
```
```javascript
bind( [1,2,3], function(a){ return [a+1] } )
=> [2,3,4]

bind( [1,2,3], function(a){ return [[a]] } )
=> [[1],[2],[3]]

bind( [1,2,3], function(a){ return a } )
=> # ERROR! The returned value is not a list!
```
```python
bind( [1,2,3], lambda a: [a+1] )
=> [2,3,4]

bind( [1,2,3], lambda a: [[a]] )
=> [[1],[2],[3]]

bind( [1,2,3], lambda a: a )
=> # ERROR! The returned value is not a list!
```
```ruby
bind( [1,2,3] ) {|a| [a+1] }
=> [2,3,4]

bind( [1,2,3] ) {|a| [[a]] }
=> [[1],[2],[3]]

bind( [1,2,3] ) {|a| a }
=> # ERROR! The returned value is not a list!
```
```clojure
(bind [1 2 3]  #(do [(+ % 1)]) )
=> [2,3,4]

(bind [1 2 3]  #(do [[ % ]]) )
=> [[1],[2],[3]]

(bind [1 2 3]  #(do %) )
=> # ERROR! The returned value is not a list!
```
```java
bind(Arrays.asList(1,2,3), i -> Arrays.asList((int)i + 1))
//=> [2,3,4]

bind(Arrays.asList(1,2,3), i -> Arrays.asList(Arrays.asList(i)));
//=> [[1],[2],[3]]

bind(Arrays.asList(3,4,5), i -> i);
//=> # ERROR! Java does this on its own! You can't even compile! Strong typing FTW!
```

As per usual, the ruby function will be passed a Proc or Lambda. Remember that the function still takes two arguments!


## Timeline
- Created: 2014-11-20
- Published: 2014-12-10
- Approved: 2014-12-16
- Completed: 2015-04-29