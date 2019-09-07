# Milk and Cookies for Santa
[*View on Codewars*](https://www.codewars.com/kata/milk-and-cookies-for-santa)

### Happy Holidays fellow Code Warriors!
It's almost Christmas Eve, so we need to prepare some milk and cookies for Santa! Wait... when exactly do we need to do that?

### Time for Milk and Cookies
Complete the function function that accepts a `Date` object, and returns `true` if it's Christmas Eve (December 24th), `false` otherwise.
~~~if:js
Keep in mind Javascript's Date month is 0 based!
~~~

### Examples

```js
timeForMilkAndCookies(new Date(2013, 11, 24))  // true
timeForMilkAndCookies(new Date(2013, 0, 23))   // false
timeForMilkAndCookies(new Date(3000, 11, 24))  // true
```
```coffee
timeForMilkAndCookies(new Date(2013, 11, 24))  // true
timeForMilkAndCookies(new Date(2013, 0, 23))   // false
timeForMilkAndCookies(new Date(3000, 11, 24))  // true
```
```ruby
time_for_milk_and_cookies(Date.new(2013, 12, 24))  # true
time_for_milk_and_cookies(Date.new(2013, 1, 23))   # false
time_for_milk_and_cookies(Date.new(3000, 12, 24))  # true
```
```python
time_for_milk_and_cookies(date(2013, 12, 24))  # True
time_for_milk_and_cookies(date(2013, 1, 23))   # False
time_for_milk_and_cookies(date(3000, 12, 24))  # True
```

## Timeline
- Created: 2013-12-16
- Published: 2013-12-17
- Approved: 2013-12-17
- Completed: 2016-09-08