const shift = offset => char => String.fromCharCode(char.charCodeAt() + offset)  

const up = shift(13)
const down = shift(-13)

const rot13 = message => message.replace(/[a-z]/gi, c => c < 'N'
  ? up(c)
  : c < 'a'
    ? down(c)
    : c < 'n'
      ? up(c)
      : down(c))