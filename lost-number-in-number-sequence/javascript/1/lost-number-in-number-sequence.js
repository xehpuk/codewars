function findDeletedNumber(arr, mixArr) {
  return arr.find(n => !mixArr.includes(n)) || 0;
}