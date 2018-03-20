var gimme = function(a) {
  return a[0] > a[1] ? a[1] > a[2] ? 1
                                   : a[0] > a[2] ? 2
                                                 : 0
                     : a[0] > a[2] ? 0
                                   : a[1] > a[2] ? 2
                                                 : 1;
};