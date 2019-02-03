function Node(data) {
  this.data = data;
  this.next = null;
}

function length(head) {
  let length = 0;
  while (head) {
    length++;
    head = head.next;
  }
  return length;  
}

function count(head, data) {
  let count = 0;
  while (head) {
    if (head.data === data) count++;
    head = head.next;
  }
  return count;
}