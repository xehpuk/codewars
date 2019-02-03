function countSheeps(arrayOfSheep) {
  return arrayOfSheep.reduce((count, sheep) => count + ~~sheep, 0)
}