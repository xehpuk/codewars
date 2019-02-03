function calculateBmi(weight, height) {
  const bmi = 10000 * weight / height / height
  const category = bmi < 35
    ? bmi < 18.5
      ? bmi < 16
        ? bmi < 15
          ? 'Very severely underweight'
          : 'Severely underweight'
        : 'Underweight'
      : bmi < 25
        ? 'Normal (healthy weight)'
        : bmi < 30
          ? 'Overweight'
          : 'Obese Class I (Moderately obese)'
    : bmi < 50
      ? bmi < 45
        ? bmi < 40
          ? 'Obese Class II (Severely obese)'
          : 'Obese Class III (Very severely obese)'
        : 'Obese Class IV (Morbidly Obese)'
      : bmi < 60
        ? 'Obese Class V (Super Obese)'
        : 'Obese Class VI (Hyper Obese)'
  
  return {
    value: bmi.toFixed(1),
    category
  }
}