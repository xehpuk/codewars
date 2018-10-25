function iqTest(numbers) {
  const nextOdd = ((regex) => () => regex.exec(numbers) % 2)(/\d\b/g)
  
  const firstOdd = nextOdd()
  const secondOdd = nextOdd()
  
  if (firstOdd !== secondOdd) {
    return nextOdd() === firstOdd ? 2 : 1
  }
  
  for (let i = 3;; i++) {
    if (nextOdd() !== firstOdd) {
      return i
    }
  }
}