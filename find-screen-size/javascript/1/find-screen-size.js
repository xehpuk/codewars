function findScreenHeight(width, ratio) {
  const [widthRatio, heightRatio] = ratio.split(':')
  const height = width / widthRatio * heightRatio
  return width + 'x' + height
}