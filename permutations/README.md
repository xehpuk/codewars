# Permutations
[*View on Codewars*](https://www.codewars.com/kata/permutations)

In this kata you have to create all permutations of an input string and remove duplicates, if present. This means, you have to shuffle all letters from the input in all possible orders.

Examples:

```javascript
permutations('a'); // ['a']
permutations('ab'); // ['ab', 'ba']
permutations('aabb'); // ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']
```
```cpp
permutations("a"); // => vector<string> {"a"}
permutations("ab"); // => vector<string> {"ab", "ba"}
permutations("aabb"); // => vector<string> {"aabb", "abab", "abba", "baab", "baba", "bbaa"}
```
```ruby
permutations('a'); # ['a']
permutations('ab'); # ['ab', 'ba']
permutations('aabb'); # ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']
```
```python
permutations('a'); # ['a']
permutations('ab'); # ['ab', 'ba']
permutations('aabb'); # ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']
```
```haskell
permutations    "a" `shouldBe` ["a"]
permutations   "ab" `shouldBe` ["ab", "ba"]
permutations "aabb" `shouldBe` ["aabb","abab","abba","baab","baba","bbaa"]
```

The order of the permutations doesn't matter.


## Timeline
- Created: 2013-10-09
- Published: 2013-10-09
- Approved: null
- Completed: 2015-05-26