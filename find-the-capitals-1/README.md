# Find the capitals
[*View on Codewars*](https://www.codewars.com/kata/find-the-capitals-1)

# Instructions 

Write a function that takes a single string (`word`) as argument. The function must return an ordered list containing the indexes of all capital letters in the string.

# Example

```javascript
Test.assertSimilar( capitals('CodEWaRs'), [0,3,4,6] );
```
```ruby
Test.assert_equals( capitals('CodEWaRs'), [0,3,4,6] );
```
```haskell
capitals ""         `shouldBe` []
capitals "CodEWaRs" `shouldBe` [0,3,4,6]
capitals "aAbB"     `shouldBe` [1,3]
capitals "4ysdf4"   `shouldBe` []
capitals "ABCDEF"   `shouldBe` [0..5]
```
```csharp
Assert.AreEqual(Kata.Capitals("CodEWaRs"), new int[]{0,3,4,6});
```

## Timeline
- Created: 2014-06-16
- Published: 2014-06-16
- Approved: 2014-06-29
- Completed: 2015-05-23