var Vector = function(components) {
  this.components = components;
  this.length = components.length;
  
  this.add = function(vector) {
    this.validate(vector);
    var components = new Array(this.length);
    for (var i = 0; i < this.length; i++) {
      components[i] = this.components[i] + vector.components[i];
    }
    return new Vector(components);
  };
  
  this.subtract = function(vector) {
    this.validate(vector);
    var components = new Array(this.length);
    for (var i = 0; i < this.length; i++) {
      components[i] = this.components[i] - vector.components[i];
    }
    return new Vector(components);
  };
  
  this.dot = function(vector) {
    this.validate(vector);
    var dot = 0;
    for (var i = 0; i < this.length; i++) {
      dot += this.components[i] * vector.components[i];
    }
    return dot;
  };
  
  this.norm = function() {
    var norm = 0;
    for (var i = 0; i < this.length; i++) {
      norm += this.components[i] * this.components[i];
    }
    return Math.sqrt(norm);
  };
  
  this.validate = function(vector) {
    if (this.length !== vector.length) {
      throw 'length';
    }
  };
  
  this.equals = function(vector) {
    if (this.length !== vector.length) {
      return false;
    }
    for (var i = 0; i < this.length; i++) {
      if (this.components[i] !== vector.components[i]) {
        return false;
      }
    }
    return true;
  };
  
  this.toString = function() {
    return '(' + this.components.join() + ')';
  };
};