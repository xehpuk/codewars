var largestDifference = function(data) {
  var d = 0;
  for (var i = 0, l = data.length - 1; l - i > d; i++)
    for (var j = l; j - i > d; j--)
      if (data[i] <= data[j])
        d = j - i;
  return d;
};