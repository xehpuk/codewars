function nthSmallest(arr, pos){
  return arr.sort((a,b)=>a-b)[pos-1]
}