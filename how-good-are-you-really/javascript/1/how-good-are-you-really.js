function betterThanAverage(classPoints, yourPoints) {
  return classPoints.reduce((sum, point) => sum + point) / classPoints.length < yourPoints
}