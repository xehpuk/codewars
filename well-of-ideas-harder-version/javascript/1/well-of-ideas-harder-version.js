function well(x) {
  const collator = new Intl.Collator('en', {
    sensitivity: 'accent',
    usage: 'search'
  })
  const y = x => x.filter(i => !collator.compare(i, 'good')).length
  switch (x.map(y).reduce((s, c) => s + c, 0)) {
    case 0:
      return 'Fail!'
    case 1:
    case 2:
      return 'Publish!'
    default:
      return 'I smell a series!'
  }
}