# Find Your Villain Name
[*View on Codewars*](https://www.codewars.com/kata/find-your-villain-name)

Create a function, <b>getVillainName</b>, that returns a villain name based on the user's birthday.  (The birthday will be passed to the function as a valid Date object, so for simplicity, there's no need to worry about converting strings to dates.)

The first name will come from the month, and the last name will come from the last digit of the date.

Month -> first name
<ul>
<li>January -> "The Evil"</li>
<li>February -> "The Vile"</li>
<li>March -> "The Cruel"</li>
<li>April -> "The Trashy"</li>
<li>May -> "The Despicable"</li>
<li>June -> "The Embarrassing"</li>
<li>July -> "The Disreputable"</li>
<li>August -> "The Atrocious"</li>
<li>September -> "The Twirling"</li>
<li>October -> "The Orange"</li>
<li>November -> "The Terrifying"</li>
<li>December -> "The Awkward"</li>
</ul>

Last digit of date -> last name
<ul>
<li>0 -> "Mustache"</li>
<li>1 -> "Pickle"</li>
<li>2 -> "Hood Ornament"</li>
<li>3 -> "Raisin"</li>
<li>4 -> "Recycling Bin"</li>
<li>5 -> "Potato"</li>
<li>6 -> "Tomato"</li>
<li>7 -> "House Cat"</li>
<li>8 -> "Teaspoon"</li>
<li>9 -> "Laundry Basket"</li>
</ul>

The returned value should be a string in the form of "First Name Last Name".

For example, a birthday of November 18 would return "The Terrifying Teaspoon"

## Timeline
- Created: 2014-05-08
- Published: 2014-05-09
- Approved: 2014-09-03
- Completed: 2016-09-08