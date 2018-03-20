# Finding Neo (PG-13)
[*View on Codewars*](https://www.codewars.com/kata/finding-neo-pg-13)

Note: This version is focused on the plot, not on special effects. If you need high-speed action, check out [Finding Neo (NC-17)](/kata/finding-neo-nc-17).

Neo is somewhere in the Matrix.
```java
public interface Matrix {
  public int size();
  public int get(int x, int y);
}
```
You are Morpheus, and your job is to find him.
```java
public class Morpheus {
  public int[] find(Matrix matrix, int neo) {
    // return Neo's x and y coordinates as a two-element array
  }
}
```
The matrix is controlled by machines, so it is very orderly. It is quadratic, and the following rules hold for all elements:
```
matrix[x,y] < matrix[x+1,y]
matrix[x,y] < matrix[x,y+1]
```
And of course, there will be no duplicates of Neo - he is *The One*.

## Timeline
- Created: 2015-04-06
- Published: 2015-04-06
- Approved: 2017-05-10
- Completed: 2015-05-16