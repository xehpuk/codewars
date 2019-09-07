function list(people) {
  if (people.length === 0) {
    return ''
  }
  
  const names = people.map((person) => person.name)
  
  function rest(names) {
    switch (names.length) {
      case 0:
        return ''
      case 1:
        return ' & ' + names[0]
      default:
        return ', ' + names[0] + rest(names.slice(1))
    }
  }
  
  return names[0] + rest(names.slice(1))
}