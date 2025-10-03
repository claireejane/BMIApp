// ********************************************
// MetricUnit.java
// Claire Jane  T00783917
// COMP 1131 – Assignment 1: Subclass (Metric Unit)
// This class extends MyBMI and handles height input in centimeters.
// It implements the abstract methods using Metric height directly.
// ********************************************

class MetricUnit extends MyBMI {
    private int heightCm;

    // Constructor
    public MetricUnit(String name, double weightKg, int heightCm) {
        super(name, weightKg);
        this.heightCm = heightCm;
    }

    // Mutator
    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    // Accessor
    public int getHeightCm() {
        return heightCm;
    }

    // Returns a formatted string of the user's details and BMI status
    @Override
    public String getDetails() {
        double heightM = heightCm / 100.0;
        return String.format(
                "Name=%-10s Weight=%6.2fkg  Height=%5.2fm  BMI=%5.2f  Result of analysis=%-14s",
                getName(), getWeightKg(), heightM, getBMI(), isNormalRange());
    }
    // Determines BMI category based on calculated value
    @Override
    public String isNormalRange() {
        double bmi = getBMI();
        if (bmi >= 25.0) {
            return "Overweight";
        } else if (bmi >= 18.5) {
            return "Normal Weight";
        } else {
            return "Underweight";
        }
    }

    // Calculates BMI after converting cm to meters
    @Override
    public double getBMI() {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }
}