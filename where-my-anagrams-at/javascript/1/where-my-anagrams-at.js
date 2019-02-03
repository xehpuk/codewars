function anagrams(word, words) {
  const normalized = normalize(word)
  
  return words.filter((word) => normalize(word) === normalized)
}

function normalize(word) {
  return Array.from(word).sort().join('')
}