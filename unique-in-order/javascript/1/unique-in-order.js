const uniqueInOrder = iterable =>
  typeof iterable === 'string'
    ? Array.from(iterable.replace(/(.)\1+/g, '$1'))
    : iterable.filter((e, i) => e !== iterable[i - 1])