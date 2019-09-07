# Replace With Alphabet Position
[*View on Codewars*](https://www.codewars.com/kata/replace-with-alphabet-position)

Welcome.

In this kata you are required to, given a string, replace every letter with its position in the alphabet.

If anything in the text isn't a letter, ignore it and don't return it.

`"a" = 1`, `"b" = 2`, etc.

## Example

```javascript
alphabetPosition("The sunset sets at twelve o' clock.")
```
```python
alphabet_position("The sunset sets at twelve o' clock.")
```
```ruby
alphabet_position("The sunset sets at twelve o' clock.")
```
```csharp
Kata.AlphabetPosition("The sunset sets at twelve o' clock.")
```
```php
alphabet_position('The sunset sets at twelve o\' clock.');
```
```c
alphabet_position("The sunset sets at twelve o' clock.");
```
```nasm
text:  db  "The sunset sets at twelve o' clock.",0h0

main:
    mov rdi, text
    call alphabet_position
```
```rust
alphabet_position("The sunset sets at twelve o' clock.")
```
```scala
alphabetPosition("The sunset sets at twelve o' clock.")
```
```groovy
Kata.alphabetPosition("The sunset sets at twelve o' clock.")
```
Should return `"20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"` (as a string)

## Timeline
- Created: 2014-11-21
- Published: 2014-11-21
- Approved: 2014-12-27
- Completed: 2018-03-05