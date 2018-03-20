function abbreviate(string) {
  return string.replace(/[a-z]+/gi, a10n);
}

function a10n(word) {
  let { length } = word;
  return length < 4 ? word : word[0] + (length - 2) + word[length - 1];
}