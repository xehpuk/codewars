function orderWeight(string) {
  const weights = string.match(/\d+/g)
  
  return weights
    ? weights.sort((w, w2) => weight(w) - weight(w2) || w.localeCompare(w2)).join(' ')
    : string
}

function weight(n) {
  for (var w = 0; n > 0; w += n % 10, n = Math.trunc(n / 10));
  
  return w;
}