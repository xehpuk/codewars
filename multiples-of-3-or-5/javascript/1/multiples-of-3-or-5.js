function solution(number) {
  const f = x => x % 3 && x % 5 ? 0 : x;
  let sum = 0;
  for (let i = 3; i < number; sum += f(i), i++);
  return sum;
}