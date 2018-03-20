function Automaton() {
   this.states = [];
}

Automaton.prototype.readCommands = function(commands) {
  if (!this.states) {
    return false;
  }
  for (var i = 0, j = 0; i < commands.length; i++) {
    j = this.states[j].move(commands[i]);
  }
  return this.states[j].accept;
}

var myAutomaton = new Automaton();

var q1 = {
  start: true,
  accept: false,
  move: function(cmd) {
    switch (cmd) {
      case "0":
        return 0;
      case "1":
        return 1;
    }
  }
};

var q2 = {
  start: false,
  accept: true,
  move: function(cmd) {
    switch (cmd) {
      case "0":
        return 2;
      case "1":
        return 1;
    }
  }
};

var q3 = {
  start: false,
  accept: false,
  move: function(cmd) {
    switch (cmd) {
      case "0":
      case "1":
        return 1;
    }
  }
};

myAutomaton.states.push(q1, q2, q3);