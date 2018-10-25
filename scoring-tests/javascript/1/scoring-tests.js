const scoreTest = (str, right, omit, wrong) =>
  str.reduce((score, answer) =>
    score + [right, omit, -wrong][answer], 0)