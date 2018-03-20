function recoverSecret(ts) {
  let ls = {};
  
  ts.forEach(t => {
    let t0 = t[0];
    let t1 = t[1];
    let t2 = t[2];
    
    init(ls, t0);
    init(ls, t1);
    init(ls, t2);
    
    push(ls[t0], t1);
    push(ls[t0], t2);
    push(ls[t1], t2);
  });
  
  Object.keys(ls).forEach(l => {
    ls[l].forEach(m => {
      ls[m].forEach(n => {
        push(ls[l], n);
      });
    });
  });
  
  return Object.keys(ls).sort((l1, l2) => ls[l2].length - ls[l1].length).join('');
}

function init(a, i) {
  if (!a[i]) {
    a[i] = [];
  }
}

function push(a, e) {
  if (!a.includes(e)) {
    a.push(e);
  }
}