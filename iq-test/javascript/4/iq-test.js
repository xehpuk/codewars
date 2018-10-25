function iqTest(numbers) {
  const nextOdd = (regex => () => regex.exec(numbers) % 2)(/\d\b/g)
  const firstOdd = nextOdd()
  
  if (nextOdd() !== firstOdd) {
    return (nextOdd() === firstOdd) + 1
  }
  
  for (let i = 3;; i++) {
    if (nextOdd() !== firstOdd) {
      return i
    }
  }
}