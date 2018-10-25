# Sum by Factors
[*View on Codewars*](https://www.codewars.com/kata/sum-by-factors)

Given an array of positive or negative integers 

<code> I= [i<sub>1</sub>,..,i<sub>n</sub>]</code>

you have to produce a sorted array P of the form 

<code>[ [p, sum of all i<sub>j</sub> of I for which p is a prime factor (p positive) of i<sub>j</sub>] ...]</code>

P will be sorted by increasing order of the prime numbers.
The final result has to be given as a string in Java, C#, C, C++ and as an array of arrays in other languages.

Example:

```fortran
I = (/12, 15/); // result = "(2 12)(3 27)(5 15)"
```
```python
I = [12, 15] # result = [[2, 12], [3, 27], [5, 15]]
```
```elixir
I = [12, 15] # result = [{2, 12}, {3, 27}, {5, 15}]
```
```rust
I = [12, 15] # result = [(2, 12), (3, 27), (5, 15)]
```
```swift
I = [12, 15] # result = [(2, 12), (3, 27), (5, 15)]
```
```ruby
I = [12, 15] # result = [[2, 12], [3, 27], [5, 15]]
```
```java
I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
```
```cpp
I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
```
```c
I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
```
```csharp
I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
```
```clojure
I = [12, 15] ; result = [[2, 12], [3, 27], [5, 15]]
```
```haskell
I = [12, 15] -- result = [(2,12),(3,27),(5,15)]
```
```javascript
I = [12, 15]; //result = [[2, 12], [3, 27], [5, 15]]
```
```coffeescript
I = [12, 15] # result = [[2, 12], [3, 27], [5, 15]]
```
```typescript
I = [12, 15]; //result = [[2, 12], [3, 27], [5, 15]]
```
```php
I = [12, 15]; //result = [[2, 12], [3, 27], [5, 15]]
```

[2, 3, 5] is the list of all prime factors of the elements of I, hence the result.

**Notes:**
- It can happen that a sum is 0 if some numbers are negative!

Example: I = [15, 30, -45]
5 divides 15, 30 and (-45) so 5 appears in the result, the sum of the numbers for which 5 is a factor is 0 so we have [5, 0] in the result amongst others. 

- In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing whitespace: you can use dynamically allocated character strings.




## Timeline
- Created: 2015-02-06
- Published: 2015-02-06
- Approved: 2015-06-05
- Completed: 2015-05-10