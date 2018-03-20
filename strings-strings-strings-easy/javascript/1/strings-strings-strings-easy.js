// Recover toString() here :)

Boolean.prototype.toString = function() {
  return this.valueOf() + "";
};

Number.prototype.toString = function() {
  return this.valueOf() + "";
};

Array.prototype.toString = function() {
  return "[" + this.toLocaleString() + "]";
};