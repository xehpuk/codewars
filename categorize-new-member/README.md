# Categorize New Member
[*View on Codewars*](https://www.codewars.com/kata/categorize-new-member)

The Western Suburbs Croquet Club has two categories of membership, Senior and Open. They would like your help with an application form that will tell prospective members which category they will be placed.

To be a senior, a member must be at least 55 years old and have a handicap greater than 7. In this croquet club, handicaps range from -2 to +26; the better the player the lower the handicap.
## Input

Input will consist of a list of lists containing two items each. Each list contains information for a single potential member. Information consists of an integer for the person's age and an integer for the person's handicap.

Note for F#: The input will be of (int list list)
which is a List<List<int>>

### Example Input
```python
[[18, 20],[45, 2],[61, 12],[37, 6],[21, 21],[78, 9]]
```
```ruby
[[18, 20],[45, 2],[61, 12],[37, 6],[21, 21],[78, 9]]
```
```javascript
[[18, 20],[45, 2],[61, 12],[37, 6],[21, 21],[78, 9]]
```
```haskell
[(18, 20),(45, 2),(61, 12),(37, 6),(21, 21),(78, 9)]
```
```csharp
new int[][] {new int[] {18, 20}, new int[] {45, 2}, new int[] {61, 12}, new int[] {37, 6}, new int[] {21, 21}, new int[] {78, 9}}
```
```fsharp
[[18; 20];[45; 2];[61; 12];[37; 6];[21; 21];[78; 9]]
```
```rust
vec![(45, 12), (55,21), (19, -2), (104, 20)])
```
```groovy
[new Tuple(45, 12), new Tuple(55,21), new Tuple(19, -2), new Tuple(104, 20)]
```

## Output
Output will consist of a list of string values (in Haskell: `Open` or `Senior`) stating whether the respective member is to be placed in the senior or open category.

### Example Output
```python
["Open", "Open", "Senior", "Open", "Open", "Senior"]
```
```ruby
["Open", "Open", "Senior", "Open", "Open", "Senior"]
```
```javascript
["Open", "Open", "Senior", "Open", "Open", "Senior"]
```
```haskell
[Open, Open, Senior, Open, Open, Senior]
```
```csharp
new string[] {"Open", "Open", "Senior", "Open", "Open", "Senior"}
```
```fsharp
["Open"; "Open"; "Senior"; "Open"; "Open"; "Senior"]
```
```rust
vec!["Open", "Senior", "Open", "Senior"]
```
```groovy
["Open", "Senior", "Open", "Senior"]
```


## Timeline
- Created: 2015-03-13
- Published: 2015-03-13
- Approved: 2015-04-26
- Completed: 2019-08-06