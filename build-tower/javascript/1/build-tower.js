function towerBuilder(nFloors) {
  const tower = Array(nFloors)
  for (let floor = 0; floor < nFloors; floor++) {
    const air = ' '.repeat(nFloors - floor - 1)
    const blocks = '*'.repeat(2 * floor + 1)
    tower[floor] = air + blocks + air
  }
  return tower
}