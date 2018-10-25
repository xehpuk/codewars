function deleteNth(arr, n) {
  const occurrences = {}
  return arr.filter(motif => {
      const occurrence = (occurrences[motif] || 0) + 1
      occurrences[motif] = occurrence
      return occurrence <= n
  })
}