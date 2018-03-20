# A Needle in the Haystack
[*View on Codewars*](https://www.codewars.com/kata/a-needle-in-the-haystack)

Can you find the needle in the haystack?

Write a function `findNeedle()` that takes an `array` full of junk but containing one `"needle"`

After your function finds the needle it should return a message (as a string) that says:

`"found the needle at position "` plus the `index` it found the needle

So 

````python
find_needle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
````
````ruby
find_needle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
````
````javascript
findNeedle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
````
````java
findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
````
````elixir
find_needle(["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"])
````

should return
````python
'found the needle at position 5'
````
````ruby
'found the needle at position 5'
````
````javascript
'found the needle at position 5'
````
````java
"found the needle at position 5"
````
````elixir
"found the needle at position 5"
````

## Timeline
- Created: 2015-12-08
- Published: 2015-12-09
- Approved: 2015-12-28
- Completed: 2016-09-08