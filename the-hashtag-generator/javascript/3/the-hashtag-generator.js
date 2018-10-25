function generateHashtag(str) {
  const trimmed = str.trim()
  if (!trimmed) {
    return false
  }
  
  const hashtag = '#' + trimmed.replace(/(?:^| +)([a-z])/gi, (_, c) => c.toUpperCase())
  return hashtag.length <= 140 && hashtag
}