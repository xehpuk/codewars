function findShort(s){
  return Math.min(...s.split(' ').map((w) => w.length))
}