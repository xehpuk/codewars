function peopleWithAgeDrink(old) {
  return old < 21
    ? old < 18
      ? old < 14
        ? 'drink toddy'
        : 'drink coke'
      : 'drink beer'
    : 'drink whisky'
}