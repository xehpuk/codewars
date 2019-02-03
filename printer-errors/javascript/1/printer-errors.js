function printerError(s) {
  return `${s.replace(/[a-m]/g,'').length}/${s.length}`;
}