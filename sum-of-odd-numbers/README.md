# Sum of odd numbers
[*View on Codewars*](https://www.codewars.com/kata/sum-of-odd-numbers)

Given the triangle of consecutive odd numbers:

```
             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
```

Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

```javascript
rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
```
```ruby
row_sum_odd_numbers(1); # 1
row_sum_odd_numbers(2); # 3 + 5 = 8
```
```rust
row_sum_odd_numbers(1); # 1
row_sum_odd_numbers(2); # 3 + 5 = 8
```
```python
row_sum_odd_numbers(1); # 1
row_sum_odd_numbers(2); # 3 + 5 = 8
```

```java
rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
```

```csharp
rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8
```

```fsharp
rowSumOddNumbers 1 // 1
rowSumOddNumbers 2 // 3 + 5 = 8
```

```haskell
rowSumOddNumbers 1 -- 1
rowSumOddNumbers 2 -- 3 + 5 = 8
```
```r
row_sum_odd_numbers(1) # 1
[1] 1
row_sum_odd_numbers(2) # 3 + 5
[1] 8
```
```if:nasm
row_sum_odd_numbers:
```
```nasm
mov rdi 1
call row_sum_odd_numbers    ; rax <- 1

mov rdi 2
call row_sum_odd_numbers   ; rax <- 3 + 5
```

```clojure
(row-sum-odd-numbers 1) # 1
(row-sum-odd-numbers 2) # 3 + 5 = 8
```

```julia
rowsumoddnumbers(1) # 1
rowsumoddnumbers(2) # 3 + 5 = 8
```

```scala
rowSumOddNumbers(1) // 1
rowSumOddNumbers(2) // 3 + 5 = 8
```



## Timeline
- Created: 2015-09-19
- Published: 2015-09-19
- Approved: 2015-09-21
- Completed: 2019-08-09