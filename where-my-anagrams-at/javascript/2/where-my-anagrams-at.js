function anagrams(word, words) {
  const normalized = normalize(word)
  
  return words.filter((word) => word.length === normalized.length && normalize(word) === normalized)
}

function normalize(word) {
  return Array.from(word).sort().join('')
}