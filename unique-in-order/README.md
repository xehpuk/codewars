# Unique In Order
[*View on Codewars*](https://www.codewars.com/kata/unique-in-order)

Implement the function unique_in_order which takes as argument a sequence and returns a list of items without any elements with the same value next to each other and preserving the original order of elements.

For example:

```javascript
uniqueInOrder('AAAABBBCCDAABBB') == ['A', 'B', 'C', 'D', 'A', 'B']
uniqueInOrder('ABBCcAD')         == ['A', 'B', 'C', 'c', 'A', 'D']
uniqueInOrder([1,2,2,3,3])       == [1,2,3]
```
```python
unique_in_order('AAAABBBCCDAABBB') == ['A', 'B', 'C', 'D', 'A', 'B']
unique_in_order('ABBCcAD')         == ['A', 'B', 'C', 'c', 'A', 'D']
unique_in_order([1,2,2,3,3])       == [1,2,3]
```
```ruby
unique_in_order('AAAABBBCCDAABBB') == ['A', 'B', 'C', 'D', 'A', 'B']
unique_in_order('ABBCcAD')         == ['A', 'B', 'C', 'c', 'A', 'D']
unique_in_order([1,2,2,3,3])       == [1,2,3]
```
```csharp
// Note that you can return any data structure you want, as long it inherits the IEnumerable interface.
UniqueInOrder("AAAABBBCCDAABBB")                     => "ABCDAB"
UniqueInOrder("ABBCcAD")                             => "ABCcAD"
UniqueInOrder("12233")                               => "123"
UniqueInOrder(new List<double> {1.1, 2.2, 2.2, 3.3}) => new List<double> {1.1, 2.2, 3.3}
```


## Timeline
- Created: 2015-02-19
- Published: 2015-02-19
- Approved: 2015-05-08
- Completed: 2018-03-04