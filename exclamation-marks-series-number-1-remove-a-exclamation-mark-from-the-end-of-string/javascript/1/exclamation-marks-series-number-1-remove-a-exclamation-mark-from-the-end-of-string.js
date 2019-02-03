function remove(s) {
  return s.endsWith('!') ? s.slice(0, -1) : s;
}