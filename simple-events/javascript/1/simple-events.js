function Event() {
  this.subs = [];
  this.subscribe = function(handler) {
    this.subs.push(handler);
  }
  this.unsubscribe = function(handler) {
    this.subs.splice(this.subs.indexOf(handler), 1);
  }
  this.emit = function() {
    this.subs.forEach(function(sub) {
      sub.apply(undefined, this.arguments);
    }, this.emit);
  }
}