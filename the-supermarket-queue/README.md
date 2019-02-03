# The Supermarket Queue
[*View on Codewars*](https://www.codewars.com/kata/the-supermarket-queue)

There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!

-------------------------------------------

The function has two input variables:

* customers: an array (list in python) of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
* n: a positive integer, the number of checkout tills.

The function should return an integer, the total time required.

-------------------------------------------

EDIT: A lot of people have been confused in the comments. To try to prevent any more confusion:

 * There is only ONE queue, and
 * The order of the queue NEVER changes, and
 * Assume that the front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free.
 * The diagram on the wiki page I linked to at the bottom of the description may be useful.


So, for example:
```javascript
queueTime([5,3,4], 1)
// should return 12
// because when n=1, the total time is just the sum of the times

queueTime([10,2,3,3], 2)
// should return 10
// because here n=2 and the 2nd, 3rd, and 4th people in the 
// queue finish before the 1st person has finished.

queueTime([2,3,10], 2)
// should return 12
```
```python
queue_time([5,3,4], 1)
# should return 12
# because when n=1, the total time is just the sum of the times

queue_time([10,2,3,3], 2)
# should return 10
# because here n=2 and the 2nd, 3rd, and 4th people in the 
# queue finish before the 1st person has finished.

queue_time([2,3,10], 2)
# should return 12
```
```ruby
queue_time([5,3,4], 1)
# should return 12
# because when n=1, the total time is just the sum of the times

queue_time([10,2,3,3], 2)
# should return 10
# because here n=2 and the 2nd, 3rd, and 4th people in the 
# queue finish before the 1st person has finished.

queue_time([2,3,10], 2)
# should return 12
```
```cpp
queueTime(std::vector<int>{5,3,4}, 1)
// should return 12
// because when n=1, the total time is just the sum of the times

queueTime(std::vector<int>{10,2,3,3}, 2)
// should return 10
// because here n=2 and the 2nd, 3rd, and 4th people in the 
// queue finish before the 1st person has finished.

queueTime(std::vector<int>{2,3,10}, 2)
// should return 12
```

N.B. You should assume that all the test input will be valid, as specified above.

P.S. The situation in this kata can be likened to the more-computer-science-related idea of a thread pool, with relation to running multiple processes at the same time: https://en.wikipedia.org/wiki/Thread_pool


## Timeline
- Created: 2016-08-14
- Published: 2016-08-14
- Approved: 2016-08-20
- Completed: 2019-01-27