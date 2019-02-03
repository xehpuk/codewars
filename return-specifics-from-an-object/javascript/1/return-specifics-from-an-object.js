function returnSpecifics(obj) {
  const entries = Object.entries(obj)
  return entries.length > 0
    ? Array.prototype.concat.apply([], entries
      .reduce(([nums, funs], [key, value]) => {
        const type = typeof value
        switch (type) {
          case 'number':
            return [[...nums, value], funs]
          case 'function':
            return [nums, [...funs, key]]
          default:
            return [nums, funs]
        }
      }, [[], []]))
    : ['The Object is Empty']
}