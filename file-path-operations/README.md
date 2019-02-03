# File Path Operations
[*View on Codewars*](https://www.codewars.com/kata/file-path-operations)

<h5 style='color:#ffff00'>Task:</h5>
This kata requires you to write an object that receives a file path 
and does operations on it.
<b style='color:#ff0000'>NOTE FOR PYTHON USERS</b>: You cannot use modules os.path, glob, and re
<h5 style='color:#00ff00'>The purpose of this kata is to use string parsing, so you're not supposed to import external libraries. I could only enforce this in python.</h5>


<h5 style='color:#ffff00'>Testing:</h5>

Python:
```python
>>> master = FileMaster('/Users/person1/Pictures/house.png')
>>> master.extension()
'png'
>>> master.filename()
'house'
>>> master.dirpath()
'/Users/person1/Pictures/'
```
Ruby:
```ruby
master = FileMaster.new('/Users/person1/Pictures/house.png')
master.extension
#--> png
master.filename
#--> house
master.dirpath
#--> /Users/person1/Pictures/
```
C#:
```csharp
FileMaster FM = new FileMaster("/Users/person1/Pictures/house.png");
FM.extension(); // output: "png"
FM.filename(); // output: "house"
FM.dirpath(); // output: "/Users/person1/Pictures/"
```
JavaScript:
```javascript
const fm = new FileMaster('/Users/person1/Pictures/house.png');
fm.extension(); // output: 'png'
fm.filename(); // output: 'house'
fm.dirpath(); // output: '/Users/person1/Pictures/'
```
TypeScript:
```typescript
const fm = new FileMaster('/Users/person1/Pictures/house.png');
fm.extension(); // output: 'png'
fm.filename(); // output: 'house'
fm.dirpath(); // output: '/Users/person1/Pictures/'
```
PHP:
```php
$fm = new FileMaster('/Users/person1/Pictures/house.png');
$fm.extension(); // 'png'
$fm.filename(); // 'house'
$fm.dirpath(); // '/Users/person1/Pictures'
```
<h5 style='color:#ffff00'>Notes:</h5>
<ul style='text-align:left;'>
<li>I have other kata that need to be tested. You may find them <a href='https://www.codewars.com/kata/5866a58b9cbc02c4f8000cac'>here</a> and <a href='https://www.codewars.com/kata/58644e8ddf95f81a38001d8d'>here</a></li>
<li>Please post any questions or suggestion in the discourse section. Thank you!</li>
<li>Thank to all users who contributed to this kata! I appreciate your input!</li>
</ul>


## Timeline
- Created: 2016-12-05
- Published: 2016-12-05
- Approved: 2016-12-09
- Completed: 2019-01-26