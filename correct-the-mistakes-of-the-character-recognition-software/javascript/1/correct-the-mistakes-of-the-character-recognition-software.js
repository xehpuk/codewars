function correct(string) {
  return string.replace(/[015]/g, m => ['O', 'I',,,, 'S'][m])
}