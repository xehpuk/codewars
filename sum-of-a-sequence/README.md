# Sum of a sequence
[*View on Codewars*](https://www.codewars.com/kata/sum-of-a-sequence)

Your task is to make function, which returns the sum of a sequence of integers.

The sequence is defined by 3 non-negative values: **begin**, **end**, **step**.

If **begin** value is greater than the **end**, function should returns **0**

*Examples*

```javascript
sequenceSum(2,2,2) === 2
sequenceSum(2,6,2) === 12 // 2 + 4 + 6
sequenceSum(1,5,1) === 15 // 1 + 2 + 3 + 4 + 5
sequenceSum(1,5,3) === 5 // 1 + 4
```
```php
sequence_sum(2, 2, 2); // => 2
sequence_sum(2, 6, 2); // => 12 (= 2 + 4 + 6)
sequence_sum(1, 5, 1); // => 15 (= 1 + 2 + 3 + 4 + 5)
sequence_sum(1, 5, 3); // => 5 (= 1 + 4)
```

```haskell
sequenceSum (2,2,2) = 2
sequenceSum (2,6,2) = 12 -- 2 + 4 + 6
sequenceSum (1,5,1) = 15 -- 1 + 2 + 3 + 4 + 5
sequenceSum (1,5,3) = 5  -- 1 + 4
```

```csharp
SequenceSum (2,2,2); // => 2
SequenceSum (2,6,2); // => 12 -> 2 + 4 + 6
SequenceSum (1,5,1); // => 15 -> 1 + 2 + 3 + 4 + 5
SequenceSum (1,5,3); // => 5 -> 1 + 4
```

```cpp
sequenceSum (2,2,2); // => 2
sequenceSum (2,6,2); // => 12 -> 2 + 4 + 6
sequenceSum (1,5,1); // => 15 -> 1 + 2 + 3 + 4 + 5
sequenceSum (1,5,3); // => 5 -> 1 + 4
```

This is the first kata in the series:

1) Sum of a sequence (this kata)  
2) [Sum of a Sequence [Hard-Core Version]](https://www.codewars.com/kata/sum-of-a-sequence-hard-core-version/javascript)


## Timeline
- Created: 2017-01-06
- Published: 2017-01-06
- Approved: 2017-01-10
- Completed: 2019-01-25