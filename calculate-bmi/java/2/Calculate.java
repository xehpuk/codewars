public class Calculate {
  public static String bmi(double weight, double height) {
    return evalBmi(weight / height / height);
  }
  
  static String evalBmi(double bmi) {
    return bmi <= 25.0
      ? bmi <= 18.5
        ? "Underweight"
        : "Normal"
      : bmi <= 30.0
        ? "Overweight"
        : "Obese";
  }
}