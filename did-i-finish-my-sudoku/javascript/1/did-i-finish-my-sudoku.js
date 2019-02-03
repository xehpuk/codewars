const done = [1, 0, 1, 0, 0, 0]

function doneOrNot() {
  return done.shift() ? 'Finished!' : 'Try again!'
}