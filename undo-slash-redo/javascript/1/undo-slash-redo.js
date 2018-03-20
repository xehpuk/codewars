function undoRedo(object) {
  this.undos = [];
  this.redos = [];
  this.undone = false;
  
  function clearRedos() {
    if (!undone) {
      redos = [];
    }
  }
  
  return {
    set: function(key, value) {
      var existed = key in object;
      var undo;
      if (existed) {
        var old = object[key];
        if (old === value) return;
        undo = function() {
          object[key] = old;
        };
      } else {
        undo = function() {
          delete object[key];
        };
      }
      object[key] = value;
      var that = this;
      undos.push({
        undo: undo,
        redo: function() {
          that.set(key, value);
        }
      });
      clearRedos();
      undone = false;
    },
    get: function(key) {
      return object[key];
    },
    del: function(key) {
      if (key in object) {
        var old = object[key];
        delete object[key];
        var that = this;
        undos.push({
          undo: function() {
            object[key] = old;
          },
          redo: function() {
            that.del(key);
          }
        });
        clearRedos();
        undone = false;
      }
    },
    undo: function() {
      var undo = undos.pop();
      undo.undo();
      clearRedos();
      redos.push(undo);
      undone = true;
    },
    redo: function() {
      if (!undone) {
        throw 'Nothing to undo!';
      }
      var redo = redos.pop();
      redo.redo();
      undone = true;
    }
  };
}