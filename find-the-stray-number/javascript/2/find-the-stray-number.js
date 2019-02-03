function stray(numbers) {
  const first = numbers[0]
  
  {
    const second = numbers[1]
    if (first !== second) {
      return first !== numbers[2]
        ? first
        : second
    }
  }
  
  for (let i = 2;; i++) {
    const ith = numbers[i]
    if (first !== ith) {
      return ith
    }
  }
}