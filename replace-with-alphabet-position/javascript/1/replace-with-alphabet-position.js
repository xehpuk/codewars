function alphabetPosition(text) {
  return Array.from(text.toLowerCase(), c => c.charCodeAt(0) - 96)
              .filter(c => c >= 1 && c <= 26)
              .join(' ')
}