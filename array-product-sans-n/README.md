# Array Product (Sans n)
[*View on Codewars*](https://www.codewars.com/kata/array-product-sans-n)

Related to <a href="https://www.codewars.com/kata/product-array-array-series-number-5">MrZizoScream's Product Array</a> kata. You might want to solve that one first :)

```if:javascript
**Note:** Node 10 has now been enabled, and you can now use its BigInt capabilities if you wish, though your resulting array must still contain strings (e.g. "99999999999", not 9999999999n)

Pre-node 10: You will need to use the provided BigNumber.js library! Please use `.toFixed(0)` or `.toPrecision()` to round instead of `.toString(10)`, as the latter is _very_ slow
```

This is an adaptation of a problem I came across on LeetCode. 

Given an array of numbers, your task is to return a new array where each index (`new_array[i]`) is equal to the product of the original array, except for the number at that index (`array[i]`).

**Two things to keep in mind:**

* Zeroes will be making their way into some of the arrays you are given
* O(n^2) solutions will not pass.

Examples:
```ruby
product_sans_n([1,2,3,4]) => [24, 12, 8, 6]
product_sans_n([2,3,4,5]) => [60, 40, 30, 24]
product_sans_n([1,1,1]) => [1, 1, 1]
product_sans_n([9,0,-2]) => [0, -18, 0])
product_sans_n([0,-99,0]) => [0, 0, 0])
product_sans_n([3,14,9,11,11]) => [15246, 3267, 5082, 4158, 4158])
product_sans_n([-8,1,5,13,-1]) => [-65, 520, 104, 40, -520])
product_sans_n([4,7,3,6,2,14,7,5]) => [123480, 70560, 164640, 82320, 246960, 35280, 70560, 98784]
```
```javascript
Note: all numbers should be returned in full string representation.

productSansN([1,2,3,4]) => ["24", "12", "8", "6"]
productSansN([2,3,4,5]) => ["60", "40", "30", "24"]
productSansN([1,1,1]) => ["1", "1", "1"]
productSansN([9,0,-2]) => ["0", "-18", "0"])
productSansN([0,-99,0]) => ["0", "0", "0"])
productSansN([3,14,9,11,11]) => ["15246", "3267", "5082", "4158", "4158"])
productSansN([-8,1,5,13,-1]) => ["-65", "520", "104", "40", "-520"])
productSansN([4,7,3,6,2,14,7,5]) => ["123480", "70560", "164640", "82320", "246960", "35280", "70560", "98784"]
```
```haskell
productSansN [1,2,3,4] -> [24, 12, 8, 6]
productSansN [2,3,4,5] -> [60, 40, 30, 24]
productSansN [1,1,1] -> [1, 1, 1]
productSansN [9,0,-2] -> [0, -18, 0])
productSansN [0,-99,0] -> [0, 0, 0])
productSansN [3,14,9,11,11] -> [15246, 3267, 5082, 4158, 4158])
productSansN [-8,1,5,13,-1] -> [-65, 520, 104, 40, -520])
productSansN [4,7,3,6,2,14,7,5] -> [123480, 70560, 164640, 82320, 246960, 35280, 70560, 98784]
```

**Note**: All inputs will be valid arrays of nonzero length.

Have fun! Please upvote if you enjoyed :)

## Timeline
- Created: 2018-07-05
- Published: 2018-07-05
- Approved: 2018-07-05
- Completed: 2019-08-08