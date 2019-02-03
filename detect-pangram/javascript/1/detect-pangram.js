function isPangram(string){
  return new Set(string
    .toLowerCase()
    .replace(/[^a-z]/g,'')).size === 26;
}