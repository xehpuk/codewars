# Parse a linked list from a string
[*View on Codewars*](https://www.codewars.com/kata/parse-a-linked-list-from-a-string)

# Parse a linked list from a string

## Related Kata

Although this Kata is not part of an official Series, you may want to complete [this Kata](https://www.codewars.com/kata/convert-a-linked-list-to-a-string) before attempting this one as these two Kata are deeply related.

## Preloaded

Preloaded for you is a class, struct or derived data type `Node` (depending on the language) used to construct linked lists in this Kata:

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
public class Node : Object
{
  public int Data;
  public Node Next;
  
  public Node(int data, Node next = null)
  {
    this.Data = data;
    this.Next = next;
  }
  
  public override bool Equals(Object obj)
  {
    // Check for null values and compare run-time types.
    if (obj == null || GetType() != obj.GetType()) { return false; }
  
    return this.ToString() == obj.ToString();
  }
  
  public override string ToString()
  {
    List<int> result = new List<int>();
    Node curr = this;
    
    while (curr != null)
    {
      result.Add(curr.Data);
      curr = curr.Next;
    }
    
    return String.Join(" -> ", result) + " -> null";
  }
}
```
```swift
class Node {
    var data : Int
    var next : Node?
    init(_ data:Int) {
        self.data = data
        self.next = nil
    }
    init(_ data:Int, _ next: Node?) {
        self.data = data
        self.next = next
    }
}
```
```c
typedef struct node {
  int data;
  struct node *next;
} Node;
```
```cpp
class Node {
  public:
    int data;
    Node *next;
    Node(int data, Node *next = nullptr): data(data), next(next) {}
};
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
```scala
case class Node(data: Int, next: Node = null)
```

~~~if:c
*NOTE: In C, the* `Node` *struct is placed on top of your main solution because otherwise the compiler complains about not recognizing the struct (even if it is defined in the Preloaded section).  Attempts to modify it (e.g. to cheat the tests in some way) will likely result in a test crash so it is not recommended for you to modify that section ;)*
~~~

~~~if:objc
*NOTE: In Objective-C, the* `Node` *struct is placed on top of your main solution because there is a "double-import" bug in the Preloaded section at the time of writing that cannot be fixed on my end.  Attempts to modify it (e.g. to cheat the tests in some way) will likely result in a test crash so it is not recommended for you to modify that section ;)*
~~~

## Prerequisites

This Kata assumes that you are already familiar with the idea of a linked list.  If you do not know what that is, you may want to read up on [this article on Wikipedia](https://en.wikipedia.org/wiki/Linked_list).  Specifically, the linked lists this Kata is referring to are **singly linked lists**, where the value of a specific node is stored in its `data`/`$data`/`Data` property, the reference to the next node is stored in its `next`/`$next`/`Next` property and the terminator for a list is `null`/`NULL`/`nil`/`nullptr`/`null()`.

Additionally, this Kata assumes that you have basic knowledge of Object-Oriented Programming (or a similar concept) in the programming language you are undertaking.  If you have not come across Object-Oriented Programming in your selected language, you may want to try out an online course or read up on some code examples of OOP in your selected language up to (but not necessarily including) Classical Inheritance.

*Specifically, if you are attempting this Kata in PHP and haven't come across OOP, you may want to try out the first 4 Kata in [this Series](https://www.codewars.com/collections/object-oriented-php).*

## Task

Create a function `parse` which accepts exactly one argument `string`/`$string`/`s`/`strrep` (or similar, depending on the language) which is a string representation of a linked list.  Your function must return the corresponding linked list, constructed from instances of the `Node` class/struct/type.  The string representation of a list has the following format: the value of the node, followed by a whitespace, an arrow and another whitespace (`" -> "`), followed by the rest of the linked list.  Each string representation of a linked list will end in `"null"`/`"NULL"`/`"nil"`/`"nullptr"`/`"null()"` depending on the language you are undertaking this Kata in.  For example, given the following string representation of a linked list:

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
```swift
"1 -> 2 -> 3 -> nil"
```
```cpp
"1 -> 2 -> 3 -> nullptr"
```
```objc
@"1 -> 2 -> 3 -> NULL"
```
```fortran
"1 -> 2 -> 3 -> null()"
```
```scala
"1 -> 2 -> 3 -> null"
```

 ... your function should return:

```php
new Node(1, new Node(2, new Node(3)))
```
```javascript
new Node(1, new Node(2, new Node(3)))
```
```csharp
new Node(1, new Node(2, new Node(3)))
```
```swift
Node(1, Node(2, Node(3)))
```
```c
// Code example not applicable to C - the Node struct does not have a constructor function
```
```cpp
new Node(1, new Node(2, new Node(3)))
```
```objc
// Code example not applicable to Objective-C - the Node struct does not have a constructor function
```
```fortran
type(Node), pointer :: list
! Where:
! list%data == 1
! list%next%data == 2
! list%next%next%data == 3
! list%next%next%next => null()
```
```scala
Node(1, Node(2, Node(3)))
```

Note that due to the way the constructor for `Node` is defined, if a second argument is not provided, the `next`/`$next`/`Next` field is automatically set to `null`/`NULL`/`nil`/`nullptr` (or equivalent in your language).  That means your function could also return the following (if it helps you better visualise what is actually going on):

```php
new Node(1, new Node(2, new Node(3, NULL)))
```
```javascript
new Node(1, new Node(2, new Node(3, null)))
```
```csharp
new Node(1, new Node(2, new Node(3, null)))
```
```swift
Node(1, Node(2, Node(3, nil)))
```
```c
// In C the Node struct does not have a constructor function - please return a dynamically allocated version of the list displayed below:

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
```cpp
new Node(1, new Node(2, new Node(3, nullptr)))
```
```objc
// In Objective-C the Node struct does not have a constructor function - please return a dynamically allocated version of the list displayed below:

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
! Code example not applicable to Fortran - there is no constructor for `Node`
```
```scala
new Node(1, new Node(2, new Node(3, null)))
```

Another example: given the following string input:

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
```swift
"0 -> 1 -> 4 -> 9 -> 16 -> nil"
```
```cpp
"0 -> 1 -> 4 -> 9 -> 16 -> nullptr"
```
```objc
@"0 -> 1 -> 4 -> 9 -> 16 -> NULL"
```
```fortran
"0 -> 1 -> 4 -> 9 -> 16 -> null()"
```
```scala
"0 -> 1 -> 4 -> 9 -> 16 -> null"
```

 ... your function should return:

```php
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```
```javascript
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```
```csharp
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
```
```swift
Node(0, Node(1, Node(4, Node(9, Node(16)))))
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
```cpp
new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))))
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
```scala
Node(0, Node(1, Node(4, Node(9, Node(16)))))
```

If the input string is just `"null"`/`"NULL"`/`"nil"`/`"nullptr"`/`"null()"`, return `null`/`NULL`/`nil`/`nullptr`/`null()` (or equivalent).

For the simplicity of this Kata, the values of the nodes in the string representation will always ever be **non-negative integers**, so the following would **not** occur: `"Hello World -> Goodbye World -> 123 -> null"`/`"Hello World -> Goodbye World -> 123 -> NULL"`/`"Hello World -> Goodbye World -> 123 -> nil"`/`"Hello World -> Goodbye World -> 123 -> nullptr"` (depending on the language).  This also means that the values of each `Node` must also be **non-negative integers** so keep that in mind when you are parsing the list from the string.

~~~if:fortran
Furthermore, if you are attempting this Kata in Fortran, you may assume that the string input will never contains leading and/or trailing whitespace.
~~~

Enjoy, and don't forget to check out my other Kata Series :D

## Timeline
- Created: 2016-11-16
- Published: 2016-11-16
- Approved: 2017-03-13
- Completed: 2018-03-04