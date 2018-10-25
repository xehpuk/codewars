const collator = new Intl.Collator(undefined, {
  usage: 'search',
  sensitivity: 'accent'
})

function titleCase(title, minorWords) {
  const exceptions = minorWords ? minorWords.split(' ') : []
  return title.replace(/(?<=^| +)(\w)(\w*)/gi, (_, c, r, o) =>
    o && exceptions.some(exception => collator.compare(exception, _) === 0)
      ? _.toLowerCase()
      : c.toUpperCase() + r.toLowerCase())
}