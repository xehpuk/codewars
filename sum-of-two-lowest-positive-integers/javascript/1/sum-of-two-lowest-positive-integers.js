function sumTwoSmallestNumbers(numbers) {
  
  const [a,b] = numbers.slice().sort((a,b)=> a-b);
  return a+b
};