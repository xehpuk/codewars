function keysAndValues(data) {
  let keys = Object.keys(data);
  let values = keys.map(key => data[key]);
  return [keys, values];
}