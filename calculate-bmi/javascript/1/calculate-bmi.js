function bmi(weight, height) {
  return evalBmi(calcBmi(weight, height))
}

function calcBmi(weight, height) {
  return weight / height / height
}

function evalBmi(bmi) {
  return bmi <= 25.0
    ? bmi <= 18.5
      ? "Underweight"
      : "Normal"
    : bmi <= 30.0
      ? "Overweight"
      : "Obese"
}