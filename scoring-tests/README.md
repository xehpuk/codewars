# Scoring Tests
[*View on Codewars*](https://www.codewars.com/kata/scoring-tests)

A new school year is approaching, which also means students will be taking tests. 

The tests in this kata are to be graded in different ways. A certain number of points will be given for each correct answer and a certain number of points will be deducted for each incorrect answer. For ommitted answers, points will either be awarded, deducted, or no points will be given at all.

Find the number of points someone has scored on varying tests of different lengths. The given parameters will be:

1) An array containing a series of 0s, 1s, and 2s, where the 0s are the correct answers, the 1s are the omitted answers, and the 2s are the incorrect answers.

2) The points awarded for correct answers

3) The points awarded or deducted for omitted answers (note that this will either be positive or negative)

4) The points deducted for incorrect answers (This value is to be subtracted)

The goal is to return the score of the given test, as such:

Examples:

```javascript
  scoreTest([0, 0, 0, 0, 2, 1, 0], 2, 0, 1); // Should return 9
  scoreTest([0, 1, 0, 0, 2, 1, 0, 2, 2, 1], 3, -1, 2); // Should return 3
```
```ruby
  score_test([0, 0, 0, 0, 2, 1, 0], 2, 0, 1); # Should return 9
  score_test([0, 1, 0, 0, 2, 1, 0, 2, 2, 1], 3, -1, 2); # Should return 3
```

Note: Don't worry, the parameters will always be as they should be (an array and three numbers)


## Timeline
- Created: 2015-08-18
- Published: 2015-08-18
- Approved: 2015-09-12
- Completed: 2018-10-06