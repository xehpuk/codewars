function createPhoneNumber(n) {
  return "(012) 345-6789".replace(/\d/g, d => n[d])
}