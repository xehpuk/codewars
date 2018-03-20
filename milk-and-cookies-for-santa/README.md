# Milk and Cookies for Santa
[*View on Codewars*](https://www.codewars.com/kata/milk-and-cookies-for-santa)

### Happy Holidays fellow Code Warriors!
It's almost Christmas Eve, so we need to prepare some milk and cookies for Santa! Wait..when exactly did we need to do that?

### Time for Milk and Cookies
Write a function `timeForMilkAndCookies` (`time_for_milk_and_cookies` in Ruby) that accepts a Date object, and returns true if it's Christmas Eve (December 24th), false otherwise. Keep in mind Javascript's Date month is 0 based, while Ruby's Date month isn't.

### Examples
Javascript/CoffeeScript:
```javascript
timeForMilkAndCookies( new Date( 2013, 11, 24 ) ) // December 24, 2013 => returns true
timeForMilkAndCookies( new Date( 2013, 0, 23 ) ) // January 23, 2013 => returns false
timeForMilkAndCookies( new Date( 3000, 11, 24 ) ) //  December 24, 3000 => returns true
```

Ruby:
```ruby
time_for_milk_and_cookies( Date.new( 2013, 12, 24 ) ) # December 24, 2013 => returns true
time_for_milk_and_cookies( Date.new( 2013, 1, 23 ) ) # January 23, 2013 => returns false
time_for_milk_and_cookies( Date.new( 3000, 12, 24 ) ) # December 24, 3000 => returns true
```

## Timeline
- Created: 2013-12-16
- Published: 2013-12-17
- Approved: 2013-12-17
- Completed: 2016-09-08