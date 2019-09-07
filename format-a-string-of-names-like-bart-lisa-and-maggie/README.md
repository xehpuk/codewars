# Format a string of names like 'Bart, Lisa & Maggie'.
[*View on Codewars*](https://www.codewars.com/kata/format-a-string-of-names-like-bart-lisa-and-maggie)

Given: an array containing hashes of names

Return: a string formatted as a list of names separated by commas except for the last two names, which should be separated by an ampersand.

Example:

``` ruby
list([ {name: 'Bart'}, {name: 'Lisa'}, {name: 'Maggie'} ])
# returns 'Bart, Lisa & Maggie'

list([ {name: 'Bart'}, {name: 'Lisa'} ])
# returns 'Bart & Lisa'

list([ {name: 'Bart'} ])
# returns 'Bart'

list([])
# returns ''
```
``` elixir
list([ %{name: "Bart"}, %{name: "Lisa"}, %{name: "Maggie"} ])
# returns 'Bart, Lisa & Maggie'

list([ %{name: "Bart"}, %{name: "Lisa"} ])
# returns 'Bart & Lisa'

list([ %{name: "Bart"} ])
# returns 'Bart'

list([])
# returns ''
```
``` javascript
list([ {name: 'Bart'}, {name: 'Lisa'}, {name: 'Maggie'} ])
// returns 'Bart, Lisa & Maggie'

list([ {name: 'Bart'}, {name: 'Lisa'} ])
// returns 'Bart & Lisa'

list([ {name: 'Bart'} ])
// returns 'Bart'

list([])
// returns ''
```
```python
namelist([ {'name': 'Bart'}, {'name': 'Lisa'}, {'name': 'Maggie'} ])
# returns 'Bart, Lisa & Maggie'

namelist([ {'name': 'Bart'}, {'name': 'Lisa'} ])
# returns 'Bart & Lisa'

namelist([ {'name': 'Bart'} ])
# returns 'Bart'

namelist([])
# returns ''
```

Note: all the hashes are pre-validated and will only contain A-Z, a-z, '-' and '.'.


## Timeline
- Created: 2014-03-29
- Published: 2014-03-29
- Approved: 2015-02-06
- Completed: 2019-02-05