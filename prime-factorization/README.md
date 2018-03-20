# Prime factorization
[*View on Codewars*](https://www.codewars.com/kata/prime-factorization)

The prime factorization of a positive integer is a list of the integer's prime factors, together with their multiplicities; the process of determining these factors is called integer factorization. The fundamental theorem of arithmetic says that every positive integer has a single unique prime factorization.

The prime factorization of 24, for instance, is (2^3) * (3^1).

~~~if:java
Write a class called `PrimeFactorizer` whose constructor takes no arguments and has an instance method `factor` accepting exactly 1 `long` which returns a `Map<Long, Integer>` where the keys are prime numbers and the values are the multiplicities.
~~~
~~~if:ruby
Without using the prime library, write a class called `PrimeFactorizer` whose constructor accepts exactly 1 integer and has an instance method `factor` returning a hash where the keys are prime numbers and the values are the multiplicities.
~~~
~~~if:javascript
Write a class called `PrimeFactorizer` whose constructor accepts exactly 1 number (a positive integer) and has a property `factor` containing an object where the keys are prime numbers **as strings** and the values are the multiplicities.
~~~
~~~if:python
Write a class called `PrimeFactorizer` (inheriting directly from `object`) whose constructor accepts exactly 1 `int` and has a property `factor` containing a dictionary where the keys are prime numbers and the values are the multiplicities.
~~~
~~~if:objc
Write a function `prime_factors` accepting exactly 1 `long long` and returns a dictionary (i.e. `NSDictionary *`) where the keys are prime numbers **as strings** (i.e. `NSString *`) and the values are the multiplicities are `NSNumber *`s representing integers.
~~~

```ruby
PrimeFactorizer.new(24).factor #should return { 2 => 3, 3 => 1 }
```
```python
PrimeFactorizer(24).factor #should return { 2: 3, 3: 1 }
```
```javascript
new PrimeFactorizer(24).factor //should return { '2': 3, '3': 1 }
```
```java
new PrimeFactorizer().factor(24) //should return { 2 => 3, 3 => 1 }
```
```objc
prime_factors(24); // => @{@"2": @3, @"3": @1}
```


## Timeline
- Created: 2014-04-13
- Published: 2014-04-13
- Approved: 2015-03-19
- Completed: 2015-05-03