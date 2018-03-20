# Name Array Capping
[*View on Codewars*](https://www.codewars.com/kata/name-array-capping)

Create a method that accepts an array of names, and returns an array of each name with its first letter capitalized.

example
```ruby
cap_me(['jo', 'nelson', 'jurie']) # returns ['Jo', 'Nelson', 'Jurie']
cap_me(['KARLY', 'DANIEL', 'KELSEY']) # returns ['Karly', 'Daniel', 'Kelsey']
```
```javascript
capMe(['jo', 'nelson', 'jurie'])     // returns ['Jo', 'Nelson', 'Jurie']
capMe(['KARLY', 'DANIEL', 'KELSEY']) // returns ['Karly', 'Daniel', 'Kelsey']
```
```haskell
capMe ["jo", "nelson", "jurie"] `shouldBe` ["Jo","Nelson","Jurie"]
capMe ["JO", "NELSON", "JURIE"] `shouldBe` ["Jo","Nelson","Jurie"]
```
```csharp
Kata.CapMe(new string[] {"jo", "nelson", "jurie"})     => new string[] {"Jo", "Nelson", "Jurie"}
Kata.CapMe(new string[] {"KARLY", "DANIEL", "KELSEY"}) => new string[] {"Karly", "Daniel", "Kelsey"}
```
```java
Kata.capMe(new String[] {"jo", "nelson", "jurie"}) // returns new String[] {"Jo", "Nelson", "Jurie"}
Kata.capMe(new String[] {"KARLY", "DANIEL", "KELSEY"}) // returns new String[] {"Karly", "Daniel", "Kelsey"}
```

## Timeline
- Created: 2014-04-22
- Published: 2014-04-22
- Approved: 2014-05-12
- Completed: 2015-05-24