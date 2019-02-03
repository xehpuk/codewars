function SeriesSum(n)
{
  let sum = 0;
  for (let i = 0; i < n; i++)
    sum += 1/(1 + 3 * i);
  return sum.toFixed(2);
}