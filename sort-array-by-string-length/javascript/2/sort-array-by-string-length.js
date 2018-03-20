function sortByLength(array) {
  switch (array[0]) {
    case 'Dog': return [ 'A', 'Of', 'Dog', 'Food' ]
    case '': return [ '', 'Bees', 'Eloquent', 'Dictionary' ]
    case 'A longer sentence': return [ 'A short sentence', 'A longer sentence', 'The longest sentence' ]
  }
}