function multiTable(number) {
  return [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].map(n => `${n} * ${number} = ${n * number}`).join('\n')
}