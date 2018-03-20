const beats = {
  rock: 'scissors',
  paper: 'rock',
  scissors: 'paper'
}

const rps = (p1, p2) => {
  return p1 === p2
    ? 'Draw!'
    : `Player ${beats[p1] === p2 ? 1 : 2} won!`
}