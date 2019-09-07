function getAverage(marks) {
  return marks.reduce((sum, mark) => sum + mark) / marks.length | 0
}