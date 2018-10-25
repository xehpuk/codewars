# Title Case
[*View on Codewars*](https://www.codewars.com/kata/title-case)

A string is considered to be in title case if each word in the string is either (a) capitalised (that is, only the first letter of the word is in upper case) or (b) considered to be an exception and put entirely into lower case unless it is the first word, which is always capitalised.

Write a function that will convert a string into title case, given an optional list of exceptions (minor words).  The list of minor words will be given as a string with each word separated by a space.  Your function should ignore the case of the minor words string -- it should behave in the same way even if the case of the minor word string is changed.

###Arguments (Haskell)

* **First argument**: space-delimited list of minor words that must always be lowercase except for the first word in the string.
* **Second argument**: the original string to be converted.

###Arguments (Other languages)

* **First argument (required)**: the original string to be converted.
* **Second argument (optional)**: space-delimited list of minor words that must always be lowercase except for the first word in the string. The JavaScript/CoffeeScript tests will pass `undefined` when this argument is unused.

###Example

```javascript
titleCase('a clash of KINGS', 'a an the of') // should return: 'A Clash of Kings'
titleCase('THE WIND IN THE WILLOWS', 'The In') // should return: 'The Wind in the Willows'
titleCase('the quick brown fox') // should return: 'The Quick Brown Fox'
```
```coffeescript
titleCase('a clash of KINGS', 'a an the of') # should return: 'A Clash of Kings'
titleCase('THE WIND IN THE WILLOWS', 'The In') # should return: 'The Wind in the Willows'
titleCase('the quick brown fox') # should return: 'The Quick Brown Fox'
```
```c
titleCase('a clash of KINGS', 'a an the of') // should return: 'A Clash of Kings'
titleCase('THE WIND IN THE WILLOWS', 'The In') // should return: 'The Wind in the Willows'
titleCase('the quick brown fox') // should return: 'The Quick Brown Fox'
```
```ruby
title_case('a clash of KINGS', 'a an the of') # should return: 'A Clash of Kings'
title_case('THE WIND IN THE WILLOWS', 'The In') # should return: 'The Wind in the Willows'
title_case('the quick brown fox') # should return: 'The Quick Brown Fox'
```
```python
title_case('a clash of KINGS', 'a an the of') # should return: 'A Clash of Kings'
title_case('THE WIND IN THE WILLOWS', 'The In') # should return: 'The Wind in the Willows'
title_case('the quick brown fox') # should return: 'The Quick Brown Fox'
```
```haskell
titleCase "a an the of" "a clash of KINGS" -- should return: "A Clash of Kings"
titleCase "The In" "THE WIND IN THE WILLOWS" -- should return: "The Wind in the Willows"
titleCase "" "the quick brown fox" -- should return: "The Quick Brown Fox"
```
```csharp
Kata.TitleCase("a an the of", "a clash of KINGS")   => "A Clash of Kings"
Kata.TitleCase("The In", "THE WIND IN THE WILLOWS") => "The Wind in the Willows"
Kata.TitleCase("the quick brown fox")               => "The Quick Brown Fox"
```

## Timeline
- Created: 2013-08-08
- Published: 2013-08-08
- Approved: null
- Completed: 2018-09-03