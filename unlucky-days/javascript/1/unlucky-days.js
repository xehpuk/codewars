function unluckyDays(year) {
  let days = 0
  
  for (let m = 0; m < 12; m++) {
    if (new Date(year, m, 13).getDay() === 5) {
      days++
    }
  }
  
  return days
}