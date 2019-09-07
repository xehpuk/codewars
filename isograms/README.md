# Isograms
[*View on Codewars*](https://www.codewars.com/kata/isograms)

An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

```haskell
isIsogram "Dermatoglyphics" == true
isIsogram "moose" == false
isIsogram "aba" == false
```
```javascript
isIsogram("Dermatoglyphics") == true
isIsogram("aba") == false
isIsogram("moOse") == false // -- ignore letter case
```
```python
is_isogram("Dermatoglyphics" ) == true
is_isogram("aba" ) == false
is_isogram("moOse" ) == false # -- ignore letter case
```
```ruby
is_isogram("Dermatoglyphics" ) == true
is_isogram("aba" ) == false
is_isogram("moOse" ) == false # -- ignore letter case
```
```C
is_isogram("Dermatoglyphics" ) == true;
is_isogram("aba" ) == false;
is_isogram("moOse" ) == false; // -- ignore letter case
```


## Timeline
- Created: 2015-01-17
- Published: 2015-01-17
- Approved: 2015-04-05
- Completed: 2018-03-11