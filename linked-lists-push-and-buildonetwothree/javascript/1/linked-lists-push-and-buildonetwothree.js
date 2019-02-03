function Node(data, next) {
  this.data = data;
  this.next = next;
}

function push(head, data) {
  return new Node(data, head)
}

function buildOneTwoThree() {
  return push(push(push(null, 3), 2), 1);
}