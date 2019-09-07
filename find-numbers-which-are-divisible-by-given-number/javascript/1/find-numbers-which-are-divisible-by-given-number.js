function divisibleBy(numbers, divisor){
  return numbers.filter(number => number % divisor === 0);
}