function iqTest(numbers) {
  const nums = numbers.split(' ')
  const firstOdd = isOdd(nums, 0)
  const secondOdd = isOdd(nums, 1)
  
  if (firstOdd !== secondOdd) {
    return isOdd(nums, 2) === firstOdd ? 2 : 1
  }
  
  for (let i = 2; i < nums.length; i++) {
    if (isOdd(nums, i) !== firstOdd) {
      return i + 1
    }
  }
}

function isOdd(a, i) {
  return a[i] % 2
}