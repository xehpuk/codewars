function generateHashtag(str) {
  if (!str) {
    return false
  }
  
  const hashtag = '#' + str.trim().replace(/(?:^| )([a-z])/gi, (_, c) => c.toUpperCase())
  return hashtag.length <= 140 && hashtag
}