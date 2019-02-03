# Basic Mathematical Operations
[*View on Codewars*](https://www.codewars.com/kata/basic-mathematical-operations)

Your task is to create a function that does four basic mathematical operations.
<p>The function should take three arguments - operation(string/char), value1(number), value2(number).<br>
The function should return result of numbers after applying the chosen operation.</p>

**Examples:**
```javascript
basicOp('+', 4, 7)         // Output: 11
basicOp('-', 15, 18)       // Output: -3
basicOp('*', 5, 5)         // Output: 25
basicOp('/', 49, 7)        // Output: 7
```
```php
basicOp('+', 4, 7)         // Output: 11
basicOp('-', 15, 18)       // Output: -3
basicOp('*', 5, 5)         // Output: 25
basicOp('/', 49, 7)        // Output: 7
```
```c#
basicOp('+', 4, 7)         // Output: 11
basicOp('-', 15, 18)       // Output: -3
basicOp('*', 5, 5)         // Output: 25
basicOp('/', 49, 7)        // Output: 7
```
```java
basicOp('+', 4, 7)         // Output: 11
basicOp('-', 15, 18)       // Output: -3
basicOp('*', 5, 5)         // Output: 25
basicOp('/', 49, 7)        // Output: 7
```
```c
basicOp('+', 4, 7)         // Output: 11
basicOp('-', 15, 18)       // Output: -3
basicOp('*', 5, 5)         // Output: 25
basicOp('/', 49, 7)        // Output: 7
```
```ruby
basic_op('+', 4, 7)         # Output: 11
basic_op('-', 15, 18)       # Output: -3
basic_op('*', 5, 5)         # Output: 25
basic_op('/', 49, 7)        # Output: 7
```
```python
basic_op('+', 4, 7)         # Output: 11
basic_op('-', 15, 18)       # Output: -3
basic_op('*', 5, 5)         # Output: 25
basic_op('/', 49, 7)        # Output: 7
```
```nasm
mov dil, '+'
mov rax, __float64__(4.0)
mov rdx, __float64__(7.0)
movq xmm0, rax
movq xmm1, rdx
call basic_op        ; XMM0 <- 11.0

mov dil, '-'
mov rax, __float64__(15.0)
mov rdx, __float64__(18.0)
movq xmm0, rax
movq xmm1, rdx
call basic_op        ; XMM0 <- -3.0

mov dil, '*'
mov rax, __float64__(5.0)
movq xmm0, rax
movq xmm1, rax
call basic_op        ; XMM0 <- 25.0

mov dil, '/'
mov rax, __float64__(49.0)
mov rdx, __float64__(7.0)
movq xmm0, rax
movq xmm1, rdx
call basic_op        ; XMM0 <- 7.0
```
```elixir
SimpleMath.basic_op("+", 4, 7)     # Output: 11
SimpleMath.basic_op("-", 15, 18)   # Output: -3
SimpleMath.basic_op("*", 5, 5)     # Output: 25
SimpleMath.basic_op("/", 49, 7)    # Output: 7
```


## Timeline
- Created: 2016-05-13
- Published: 2016-05-13
- Approved: 2016-05-16
- Completed: 2019-01-29