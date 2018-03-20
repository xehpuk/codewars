function tug_o_war(teams) {
  var team1 = 'Team 1 wins!';
  var team2 = 'Team 2 wins!';
  var tie = "It's a tie!";
  var sum1 = sum(teams[0]);
  var sum2 = sum(teams[1]);
  if (sum1 > sum2) return team1;
  if (sum1 < sum2) return team2;
  var anchor1 = teams[0][0];
  var anchor2 = teams[1][4];
  if (anchor1 > anchor2) return team1;
  if (anchor1 < anchor2) return team2;
  return tie;
}

function sum(team) {
  return team[0] + team[1] + team[2] + team[3] + team[4];
}