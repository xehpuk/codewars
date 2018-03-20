function wdm(talk) {
  return talk.split(/\s+/).filter(w => !['', 'puke', 'hiccup'].includes(w)).join(' ')
}