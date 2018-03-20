function skrzat(type, input) {
  switch (type) {
    case 'b':
      return 'From binary: ' + input + ' is ' + skrzatb(input);
    case 'd':
      return 'From decimal: ' + input + ' is ' + skrzatd(input);
  }
}

function skrzatb(input) {
  var skrzat = 0;
  for (var i = input.length; i --> 0;) {
    if (+input[i]) {
      skrzat += pow2(input.length - i - 1);
    }
  }
  return skrzat;
}

function skrzatd(input) {
  var bits = new Array(32);
  while (input) {
    var lg = Math.round(log2(input));
    bits[lg] = true;
    input -= pow2(lg);
  }
  var skrzat = '';
  for (var i = bits.length; i --> 0;) {
    var bit = bits[i];
    if (bit) {
      skrzat += 1;
    } else if (skrzat) {
      skrzat += 0;
    }
  }
  return skrzat || '0';
}

function pow2(x) {
  return Math.pow(-2, x);
}

function log2(x) {
  return Math.log(Math.abs(x)) / Math.LN2;
}