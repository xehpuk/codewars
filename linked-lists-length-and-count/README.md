# Linked Lists - Length & Count
[*View on Codewars*](https://www.codewars.com/kata/linked-lists-length-and-count)

Linked Lists - Length & Count

Implement Length() to count the number of nodes in a linked list.<br>
```javascript
length(null) => 0
length(1 -> 2 -> 3 -> null) => 3
```
```csharp
Node.Length(nullptr) => 0
Node.Length(1 -> 2 -> 3 -> nullptr) => 3
```
```c++
length(null) => 0
length(1 -> 2 -> 3 -> null) => 3
```
```if-not:csharp
Implement Count() to count the occurrences of an integer in a linked list.
```
```if:csharp
Implement Count() to count the occurrences of a that satisfy a condition provided by a predicate which takes in a node's Data value.
```
```javascript
count(null, 1) => 0
count(1 -> 2 -> 3 -> null, 1) => 1
count(1 -> 1 -> 1 -> 2 -> 2 -> 2 -> 2 -> 3 -> 3 -> null, 2) => 4
```
```csharp
Node.Count(null, value => value == 1) => 0
Node.Count(1 -> 3 -> 5 -> 6, value => value % 2 != 0) => 3
```
```c++
count(null, 1) => 0
count(1 -> 2 -> 3 -> nullptr, 1) => 1
count(1 -> 1 -> 1 -> 2 -> 2 -> 2 -> 2 -> 3 -> 3 -> nullptr, 2) => 4
```

I've decided to bundle these two functions within the same Kata since they are both very similar.

The `push()`/`Push()` and `buildOneTwoThree()`/`BuildOneTwoThree()` functions do not need to be redefined.

Related Kata in order of expected completion (increasing difficulty):<br>
 <a href="http://www.codewars.com/kata/linked-lists-push-and-buildonetwothree">Linked Lists - Push & BuildOneTwoThree</a><br>
 <a href="http://www.codewars.com/kata/linked-lists-length-and-count">Linked Lists - Length & Count</a><br>
 <a href="http://www.codewars.com/kata/linked-lists-get-nth-node">Linked Lists - Get Nth Node</a><br>
<a href="http://www.codewars.com/kata/linked-lists-insert-nth-node">Linked Lists - Insert Nth Node</a><br>
<a href="http://www.codewars.com/kata/linked-lists-sorted-insert">Linked Lists - Sorted Insert</a><br>
<a href="http://www.codewars.com/kata/linked-lists-insert-sort">Linked Lists - Insert Sort</a><br>
<a href="http://www.codewars.com/kata/linked-lists-append">Linked Lists - Append</a><br>
<a href="http://www.codewars.com/kata/linked-lists-remove-duplicates">Linked Lists - Remove Duplicates</a><br>
<a href="http://www.codewars.com/kata/linked-lists-move-node">Linked Lists - Move Node</a><br>
<a href="http://www.codewars.com/kata/linked-lists-move-node-in-place">Linked Lists - Move Node In-place</a><br>
<a href="http://www.codewars.com/kata/linked-lists-alternating-split">Linked Lists - Alternating Split</a><br>
<a href="http://www.codewars.com/kata/linked-lists-front-back-split">Linked Lists - Front Back Split</a><br>
<a href="http://www.codewars.com/kata/linked-lists-shuffle-merge">Linked Lists - Shuffle Merge</a><br>
<a href="http://www.codewars.com/kata/linked-lists-sorted-merge">Linked Lists - Sorted Merge</a><br>
<a href="http://www.codewars.com/kata/linked-lists-merge-sort">Linked Lists - Merge Sort</a><br>
<a href="http://www.codewars.com/kata/linked-lists-sorted-intersect">Linked Lists - Sorted Intersect</a><br>
<a href="http://www.codewars.com/kata/linked-lists-iterative-reverse">Linked Lists - Iterative Reverse</a><br>
<a href="http://www.codewars.com/kata/linked-lists-recursive-reverse">Linked Lists - Recursive Reverse</a><br>

Inspired by Stanford Professor Nick Parlante's excellent [Linked List teachings.](http://cslibrary.stanford.edu/103/LinkedListBasics.pdf)

## Timeline
- Created: 2015-08-03
- Published: 2015-08-03
- Approved: 2015-09-19
- Completed: 2018-12-31