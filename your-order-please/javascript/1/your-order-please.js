const digit = (word) => /\d/.exec(word)[0]

const order = (words) => words
  .split(' ')
  .sort((w, w2) => digit(w) - digit(w2))
  .join(' ')