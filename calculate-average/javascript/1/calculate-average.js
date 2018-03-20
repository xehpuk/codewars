function find_average(array) {
  return array.reduce((sum, summand) => sum + summand, 0) / array.length
}