function validPhoneNumber(phoneNumber) {
  return /^(?:\d+|\(\d+\) \d+-\d+)$/.test(phoneNumber);
}