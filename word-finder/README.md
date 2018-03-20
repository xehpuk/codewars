# Word Finder
[*View on Codewars*](https://www.codewars.com/kata/word-finder)

In this kata you have to extend the dictionary with a method, that returns a list of words matching a pattern. This pattern may contain letters (lowercase) and placeholders ("?"). A placeholder stands for exactly one arbitrary letter.

Example:

```javascript
var fruits = new Dictionary(['banana', 'apple', 'papaya', 'cherry']);
fruits.getMatchingWords('lemon');     // must return []
fruits.getMatchingWords('cherr??');   // must return []
fruits.getMatchingWords('?a?a?a');    // must return ['banana', 'papaya']
fruits.getMatchingWords('??????');    // must return ['banana', 'papaya', 'cherry']
```

```coffeescript
fruits = new Dictionary([
  'banana'
  'apple'
  'papaya'
  'cherry'
])
fruits.getMatchingWords 'lemon'          # must return []
fruits.getMatchingWords 'cherr??'        # must return []
fruits.getMatchingWords '?a?a?a'         # must return ['banana', 'papaya']
fruits.getMatchingWords '??????'         # must return ['banana', 'papaya', 'cherry']
```

Additional Notes:

* the words and patterns are all lowercase
* the order of the returned words doesn't matter

## Timeline
- Created: 2013-10-15
- Published: 2013-10-15
- Approved: null
- Completed: 2015-05-24