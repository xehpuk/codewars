# Decode the Morse code 
[*View on Codewars*](https://www.codewars.com/kata/decode-the-morse-code)

<div style="border:1px solid;position:relative;padding:1ex 1ex 1ex 11.1em;"><div style="position:absolute;left:0;top:0;bottom:0; width:10em; padding:1ex;text-align:center;border:1px solid;margin:0 1ex 0 0;color:#000;background-color:#eee;font-variant:small-caps">Part of Series 1/3</div><div>This kata is part of a series on the Morse code. After you solve this kata, you may move to the [next one](/kata/decode-the-morse-code-advanced).</div></div><br>In this kata you have to write a simple <a href="https://en.wikipedia.org/wiki/Morse_code">Morse code</a> decoder. While the Morse code is now mostly superceded by voice and digital data communication channels, it still has its use in some applications around the world.

The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter <code>A</code> is coded as <code>Â·âˆ’</code>, letter <code>Q</code> is coded as <code>âˆ’âˆ’Â·âˆ’</code>, and digit <code>1</code> is coded as <code>Â·âˆ’âˆ’âˆ’âˆ’</code>. The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. For example, the message <code>HEY JUDE</code> in Morse code is <code>Â·Â·Â·Â· Â· âˆ’Â·âˆ’âˆ’ &nbsp; Â·âˆ’âˆ’âˆ’ Â·Â·âˆ’ âˆ’Â·Â· Â·</code>.

**NOTE:** Extra spaces before or after the code have no meaning and should be ignored.

In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal <a href="https://en.wikipedia.org/wiki/SOS">SOS</a> (that was first issued by <a href="https://en.wikipedia.org/wiki/RMS_Titanic">Titanic</a>), that is coded as <code>Â·Â·Â·âˆ’âˆ’âˆ’Â·Â·Â·</code>. These special codes are treated as single special characters, and usually are transmitted as separate words.

Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

For example:

```coffeescript
decodeMorse('.... . -.--   .--- ..- -.. .')
//should return "HEY JUDE"
```
```cpp
decodeMorse('.... . -.--   .--- ..- -.. .')
//should return "HEY JUDE"
```
```csharp
MorseCodeDecoder.Decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"
```
```elixir
MorseCode.decode('.... . -.--   .--- ..- -.. .')
#=> "HEY JUDE"
```
```go
DecodeMorse(".... . -.--   .--- ..- -.. .")
// should return "HEY JUDE"
```
```haskell
decodeMorse ".... . -.--   .--- ..- -.. ."
--should return "HEY JUDE"
```
```java
MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"
```
```javascript
decodeMorse('.... . -.--   .--- ..- -.. .')
//should return "HEY JUDE"
```
```kotlin
decodeMorse('.... . -.--   .--- ..- -.. .')
//should return "HEY JUDE"
```
```php
decode_morse('.... . -.--   .--- ..- -.. .')
//should return "HEY JUDE"
```
```python
decodeMorse('.... . -.--   .--- ..- -.. .')
#should return "HEY JUDE"
```
```ruby
decodeMorse('.... . -.--   .--- ..- -.. .')
#should return "HEY JUDE"
```
```typescript
decodeMorse('.... . -.--   .--- ..- -.. .')
//should return "HEY JUDE"
```
```rust
MorseDecoder::new().decode_morse(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"
```

**NOTE:** For coding purposes you have to use ASCII characters `.` and `-`, not Unicode characters.

The Morse code table is preloaded for you as a dictionary, feel free to use it:
+ Coffeescript/C++/Go/JavaScript/PHP/Python/Ruby/TypeScript: `MORSE_CODE['.--']`
+ C#: `MorseCode.Get(".--")` (returns `string`)
+ Elixir: `morse_codes` variable
+ Haskell: `morseCodes ! ".--"` (Codes are in a `Map String String`)
+ Java: `MorseCode.get(".--")`
+ Kotlin: `MorseCode[".--"] ?: ""` or `MorseCode.getOrDefault(".--", "")`
+ Rust: `self.morse_code`

All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions. In C#, tests will fail if the solution code throws an exception, please keep that in mind. This is mostly because otherwise the engine would simply ignore the tests, resulting in a "valid" solution.

Good luck!

After you complete this kata, you may try yourself at <a href="http://www.codewars.com/kata/decode-the-morse-code-advanced">Decode the Morse code, advanced</a>.


## Timeline
- Created: 2015-01-15
- Published: 2015-01-15
- Approved: 2015-02-02
- Completed: 2015-05-01