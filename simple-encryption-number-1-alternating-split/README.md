# Simple Encryption #1 - Alternating Split
[*View on Codewars*](https://www.codewars.com/kata/simple-encryption-number-1-alternating-split)

For building the encrypted string:<br/>Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.<br/>
Do this n times!

Examples:
```
"This is a test!", 1 -> "hsi  etTi sats!"
"This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
```

Write two methods:
```csharp
string Encrypt(string text, int n)
string Decrypt(string encryptedText, int n)
```
```cpp
std::string encrypt(std::string text, int n)
std::string decrypt(std::string encryptedText, int n)
```
```java
String encrypt(final String text, final int n)
String decrypt(final String encryptedText, final int n)
```
```javascript
function encrypt(text, n)
function decrypt(encryptedText, n)
```
```coffeescript
encrypt = (text, n) ->
decrypt = (encryptedText, n) ->
```
```python
def encrypt(text, n)
def decrypt(encrypted_text, n)
```
```ruby
def encrypt(text, n)
def decrypt(encrypted_text, n)
```
```php
function encrypt($text, $n) 
function decrypt($text, $n)
```

```Fsharp
let encrypt (str:string) (n:int) -> string
let decrypt (str:string) (n:int) -> string
```

For both methods:<br/>
If the input-string is null or empty return exactly this value!<br/>
If n is <= 0 then return the input text.<br/>

This kata is part of the Simple Encryption Series:<br>
<a href="https://www.codewars.com/kata/simple-encryption-number-1-alternating-split" taget=_blank>Simple Encryption #1 - Alternating Split</a><br>
<a href="https://www.codewars.com/kata/simple-encryption-number-2-index-difference" taget=_blank>Simple Encryption #2 - Index-Difference</a><br>
<a href="https://www.codewars.com/kata/simple-encryption-number-3-turn-the-bits-around" taget=_blank>Simple Encryption #3 - Turn The Bits Around</a><br>
<a href="https://www.codewars.com/kata/simple-encryption-number-4-qwerty" taget=_blank>Simple Encryption #4 - Qwerty</a><br>

Have fun coding it and please don't forget to vote and rank this kata! :-)

## Timeline
- Created: 2016-07-09
- Published: 2016-07-09
- Approved: 2016-08-08
- Completed: 2018-03-11