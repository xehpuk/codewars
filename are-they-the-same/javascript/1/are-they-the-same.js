function comp(a1, a2) {
  if (!a1 || !a2) {
    return false;
  }
  
  let l = a1.length;
  
  if (l !== a2.length) {
    return false;
  }
  
  let c = (e1, e2) => e1 - e2;
  a1.sort(c);
  a2.sort(c);
    
  for (let i = 0; i < l; i++) {
    let e1 = a1[i];
    if (e1 * e1 !== a2[i]) {
      return false;
    }
  }
  return true;
}