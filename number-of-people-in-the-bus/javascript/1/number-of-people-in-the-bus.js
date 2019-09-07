function number(busStops) {
  return busStops.reduce((passengers, [into, off]) => passengers + into - off, 0)
}