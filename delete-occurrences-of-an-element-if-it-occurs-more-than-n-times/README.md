# Delete occurrences of an element if it occurs more than n times
[*View on Codewars*](https://www.codewars.com/kata/delete-occurrences-of-an-element-if-it-occurs-more-than-n-times)

## Enough is enough!

Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like this sessions, since the motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will only sit during the session if they show the same motive at most N times. Luckily, Alice and Bob are able to encode the motive as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?

## Task

Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].

~~~if:nasm
## NASM notes

Write the output numbers into the `out` parameter, and return its length.

The input array will contain only integers between 1 and 50 inclusive. Use it to your advantage.
~~~

~~~if:c
For C:
* Assign the return array length to the pointer parameter `*szout`.
* Do not mutate the input array.
~~~

## Example
```python
  delete_nth ([1,1,1,1],2) # return [1,1]
  
  delete_nth ([20,37,20,21],1) # return [20,37,21]
```
```ruby
  delete_nth ([1,1,1,1],2) # return [1,1]
  
  delete_nth ([20,37,20,21],1) # return [20,37,21]
```
```javascript
  deleteNth ([1,1,1,1],2) // return [1,1]
  
  deleteNth ([20,37,20,21],1) // return [20,37,21]
```
```haskell
deleteNth [20,37,20,21]       1 `shouldBe` [20,37,21]
deleteNth [1,1,3,3,7,2,2,2,2] 3 `shouldBe` [1, 1, 3, 3, 7, 2, 2, 2]
```
```csharp
Kata.DeleteNth (new int[] {20,37,20,21}, 1) // return [20,37,21]
Kata.DeleteNth (new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
```
```java
EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
```
```c++
deleteNth({20,37,20,21}, 1) // return {20,37,21}
deleteNth({1,1,3,3,7,2,2,2,2}, 3) // return {1, 1, 3, 3, 7, 2, 2, 2}
```
```c
delete_nth(4, {1, 1, 1, 1}, 2, *p)     // returns {1, 1}, 2
delete_nth(4, {20, 37, 20, 21}, 1, *p) // returns {20, 37, 21}, 3
```


## Timeline
- Created: 2015-05-08
- Published: 2015-05-08
- Approved: 2015-05-20
- Completed: 2018-07-07