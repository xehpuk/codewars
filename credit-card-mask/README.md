# Credit Card Mask
[*View on Codewars*](https://www.codewars.com/kata/credit-card-mask)

Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function `maskify`, which changes all but the last four characters into `'#'`.

## Examples
```javascript
maskify("4556364607935616") == "############5616"
maskify(     "64607935616") ==      "#######5616"
maskify(               "1") ==                "1"
maskify(                "") ==                 ""

// "What was the name of your first pet?"
maskify("Skippy")                                   == "##ippy"
maskify("Nananananananananananananananana Batman!") == "####################################man!"
```
```coffeescript
maskify("4556364607935616") == "############5616"
maskify(     "64607935616") ==      "#######5616"
maskify(               "1") ==                "1"
maskify(                "") ==                 ""

# "What was the name of your first pet?"
maskify("Skippy")                                   == "##ippy"
maskify("Nananananananananananananananana Batman!") == "####################################man!"
```
```python
maskify("4556364607935616") == "############5616"
maskify(     "64607935616") ==      "#######5616"
maskify(               "1") ==                "1"
maskify(                "") ==                 ""

# "What was the name of your first pet?"
maskify("Skippy")                                   == "##ippy"
maskify("Nananananananananananananananana Batman!") == "####################################man!"
```
```haskell
maskify "4556364607935616" == "############5616"
maskify      "64607935616" ==      "#######5616"
maskify                "1" ==                "1"
maskify                 "" ==                 ""

-- "What was the name of your first pet?"
maskify "Skippy" == "##ippy"
maskify "Nananananananananananananananana Batman!"
     -- "####################################man!"
```
```ruby
maskify('4556364607935616') # should return '############5616'
maskify('64607935616')      # should return '#######5616'
maskify('1')                # should return '1'
maskify('')                 # should return ''

# "What was the name of your first pet?"
maskify('Skippy')                                   # should return '##ippy'
maskify('Nananananananananananananananana Batman!') # should return '####################################man!'
```

```csharp
Kata.Maskify('4556364607935616'); // should return "############5616"
Kata.Maskify('64607935616');      // should return "#######5616"
Kata.Maskify('1');                // should return "1"
Kata.Maskify('');                 // should return ""

// "What was the name of your first pet?"
Kata.Maskify('Skippy');                                   // should return "##ippy"
Kata.Maskify('Nananananananananananananananana Batman!'); // should return "####################################man!"
```

```java
Maskify.Maskify("4556364607935616"); // should return "############5616"
Maskify.Maskify("64607935616");      // should return "#######5616"
Maskify.Maskify("1");                // should return "1"
Maskify.Maskify("");                 // should return ""

// "What was the name of your first pet?"
Maskify.Maskify("Skippy");                                   // should return "##ippy"
Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
```

## Timeline
- Created: 2014-09-12
- Published: 2014-09-16
- Approved: 2015-03-19
- Completed: 2015-05-24