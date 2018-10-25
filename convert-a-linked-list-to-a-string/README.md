# Convert a linked list to a string
[*View on Codewars*](https://www.codewars.com/kata/convert-a-linked-list-to-a-string)

# Convert a linked list to a string

## Related Kata

Although this Kata is not part of an official Series, you may also want to try out [Parse a linked list from a string](https://www.codewars.com/kata/582c5382f000e535100001a7) if you enjoyed this Kata.

## Preloaded

Preloaded for you is a class, struct or derived data type `Node` (depending on the language) used to construct linked lists in this Kata:

```c
typedef struct node {
  int data;
  struct node *next;
} Node;
```
```php
class Node {
  public $data, $next;
  public function __construct($data, $next = NULL) {
    $this->data = $data;
    $this->next = $next;
  }
}
```
```javascript
class Node {
  constructor(data, next = null) {
    this.data = data;
    this.next = next;
  }
}
```
```csharp
public class Node {
  public int Data { get; private set; }
  public Node Next { get; private set; }

  public Node(int data, Node next = null) {
    Data = data;
    Next = next;
  }
}
```
```python
class Node():
    def __init__(self, data, next = None):
        self.data = data
        self.next = next
```
```java
class Node {
	private int data;
	private Node next;
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}
}
```
```ruby
class Node
  attr_reader :data, :next_node
  
  def initialize(data, next_node=nil)
    @data = data
    @next_node = next_node
  end
end
```
```cpp
class Node
{
  public:
    int data;
    Node* next;
  
  Node(int data, Node* next = nullptr)
  {
    this->data = data;
    this->next = next;
  }
};
```
```haskell
-- You can use regular lists, which are already singly-linked
data [a] = [] | a : [a]
```
```objc
typedef struct node {
  int data;
  struct node *next;
} Node;
```
```fortran
type Node
  integer :: data
  type(Node), pointer :: next
end type Node
```

~~~if:objc
*NOTE: In Objective-C, the* `Node` *struct is placed on top of your main solution because there is a "double-import" bug in the Preloaded section at the time of writing (which cannot be fixed on my end).  Attempts to modify it (e.g. to cheat the tests in some way) will likely result in a test crash so it is not recommended for you to modify that section ;)*
~~~

~~~if:c
*NOTE: In C, the* `Node` *struct is placed on top of your main solution (and the [Sample] Test Cases) because the compiler complains about not recognizing the* `Node` *datatype even after adding it to the Preloaded section.  Attempts to modify it (e.g. to cheat the tests in some way) will likely result in a test crash so it is not recommended for you to modify that section ;)*
~~~

If you are attempting this Kata in NASM then note that the code example shown directly above may not be relevant; please refer to the Sample Tests (written in C) for the exact definition of the `Node` structure.

## Prerequisites

This Kata assumes that you are already familiar with the idea of a linked list.  If you do not know what that is, you may want to read up on [this article on Wikipedia](https://en.wikipedia.org/wiki/Linked_list).  Specifically, the linked lists this Kata is referring to are **singly linked lists**, where the value of a specific node is stored in its `data`/`$data`/`Data` property, the reference to the next node is stored in its `next`/`$next`/`Next`/`next_node` property and the terminator for a list is `null`/`NULL`/`None`/`nil`/`nullptr`/`null()`.

## Task

*If you are attempting this Kata in NASM, the code examples shown below may not be relevant at all - please refer to the Sample Tests (written in C) for the exact requirements.*

Create a function `stringify` which accepts an argument `list`/`$list` and returns a string representation of the list.  The string representation of the list starts with the value of the current `Node`, specified by its `data`/`$data`/`Data` property, followed by a whitespace character, an arrow and another whitespace character (`" -> "`), followed by the rest of the list.  The end of the string representation of a list must always end with `null`/`NULL`/`None`/`nil`/`nullptr`/`null()` (all caps or all lowercase depending on the language you are undertaking this Kata in).  For example, given the following list:

```php
new Node(1, new Node(2, new Node(3)))
```
```javascript
new Node(1, new Node(2, new Node(3)))
```
```csharp
new Node(1, new Node(2, new Node(3)))
```
```python
Node(1, Node(2, Node(3)))
```
```java
new Node(1, new Node(2, new Node(3)))
```
```ruby
Node.new(1, Node.new(2, Node.new(3)))
```
```cpp
new Node(1, new Node(2, new Node(3)))
```
```haskell
[1,2,3]
```
```objc
&((Node){
  .data = 1,
  .next = &((Node){
    .data = 2,
    .next = &((Node){
      .data = 3,
      .next = NULL
    })
  })
})
```
```c
&((Node){
  .data = 1,
  .next = &((Node){
    .data = 2,
    .next = &((Node){
      .data = 3,
      .next = NULL
    })
  })
})
```
```fortran
type(Node), pointer :: oneTwoThree
! Where:
! oneTwoThree%data == 1
! oneTwoThree%next%data == 2
! oneTwoThree%next%next%data == 3
! oneTwoThree%next%next%next => null()
```


... its string representation would be:

```php
"1 -> 2 -> 3 -> NULL"
```
```c
"1 -> 2 -> 3 -> NULL"
```
```javascript
"1 -> 2 -> 3 -> null"
```
```csharp
"1 -> 2 -> 3 -> null"
```
```python
"1 -> 2 -> 3 -> None"
```
```java
"1 -> 2 -> 3 -> null"
```
```ruby
"1 -> 2 -> 3 -> nil"
```
```cpp
"1 -> 2 -> 3 -> nullptr"
```
```haskell
"1 -> 2 -> 3 -> null"
```
```objc
@"1 -> 2 -> 3 -> NULL"
```
```fortran
"1 -> 2 -> 3 -> null()"
```

And given the following linked list:

```php
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```
```javascript
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```
```csharp
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```
```python
Node(0, Node(1, Node(4, Node(9, Node(16)))))
```
```java
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```
```ruby
Node.new(0, Node.new(1, Node.new(4, Node.new(9, Node.new(16)))))
```
```cpp
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```
```haskell
[0,1,4,9,16]
```
```objc
&((Node){
  .data = 0,
  .next = &((Node){
    .data = 1,
    .next = &((Node){
      .data = 4,
      .next = &((Node){
        .data = 9,
        .next = &((Node){
          .data = 16,
          .next = NULL
        })
      })
    })
  })
})
```
```c
&((Node){
  .data = 0,
  .next = &((Node){
    .data = 1,
    .next = &((Node){
      .data = 4,
      .next = &((Node){
        .data = 9,
        .next = &((Node){
          .data = 16,
          .next = NULL
        })
      })
    })
  })
})
```
```fortran
type(Node), pointer :: list
! Where:
! list%data == 0
! list%next%data == 1
! list%next%next%data == 4
! list%next%next%next%data == 9
! list%next%next%next%next%data == 16
! list%next%next%next%next%next => null()
```

... its string representation would be:

```php
"0 -> 1 -> 4 -> 9 -> 16 -> NULL"
```
```c
"0 -> 1 -> 4 -> 9 -> 16 -> NULL"
```
```javascript
"0 -> 1 -> 4 -> 9 -> 16 -> null"
```
```csharp
"0 -> 1 -> 4 -> 9 -> 16 -> null"
```
```python
"0 -> 1 -> 4 -> 9 -> 16 -> None"
```
```java
"0 -> 1 -> 4 -> 9 -> 16 -> null"
```
```ruby
"0 -> 1 -> 4 -> 9 -> 16 -> nil"
```
```cpp
"0 -> 1 -> 4 -> 9 -> 16 -> nullptr"
```
```haskell
"0 -> 1 -> 4 -> 9 -> 16 -> null"
```
```objc
@"0 -> 1 -> 4 -> 9 -> 16 -> NULL"
```
```fortran
"0 -> 1 -> 4 -> 9 -> 16 -> null()"
```

Note that `null`/`NULL`/`None`/`nil`/`nullptr`/`null()` itself is also considered a valid linked list.  In that case, its string representation would simply be `"null"`/`"NULL"`/`"None"`/`"nil"`/`"nullptr"`/`@"NULL"`/`"null()"` (again, depending on the language).

For the simplicity of this Kata, you may assume that any `Node` in this Kata may only contain **non-negative integer** values.  For example, you will not encounter a `Node` whose `data`/`$data`/`Data` property is `"Hello World"`.

Enjoy, and don't forget to check out my other Kata Series :D

~~~if:fortran
*NOTE: In Fortran, your returned string is* **not** *permitted to contain any leading and/or trailing whitespace.*
~~~

## Timeline
- Created: 2016-11-16
- Published: 2016-11-16
- Approved: 2016-11-20
- Completed: 2018-03-04