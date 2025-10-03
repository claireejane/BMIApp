// ********************************************
// ImperialUnit.java
// Claire Jane  T00783917
// COMP 1131 – Assignment 1: Subclass (Imperial Unit)
// This class extends MyBMI and handles height input in feet and inches.
// It implements the abstract methods using Imperial-to-Metric conversion.
// ********************************************

class ImperialUnit extends MyBMI {
    private int heightFt;
    private int heightIn;

    // Constructor for imperial including everything from before plus height in ft and inches
    public ImperialUnit(String name, double weightKg, int heightFt, int heightIn) {
        super(name, weightKg);
        this.heightFt = heightFt;
        this.heightIn = heightIn;
    }

    // Mutators
    public void setHeightIn(int heightIn) {
        this.heightIn = heightIn;
    }

    public void setHeightFt(int heightFt) {
        this.heightFt = heightFt;
    }

    // Accessors
    public int getHeightIn() {
        return heightIn;
    }

    public int getHeightFt() {
        return heightFt;
    }

    // Returns a formatted string of the user's details and BMI status
    @Override
    public String getDetails() {
        double heightInM = ((heightFt * 30.48) + (heightIn * 2.54)) / 100.0;
        return String.format(
                "Name=%-10s Weight=%6.2fkg  Height=%5.2fm  BMI=%5.2f  Result of analysis=%-14s",
                getName(), getWeightKg(), heightInM, getBMI(), isNormalRange());
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

    // Calculates BMI after converting height in ft/in to meters
    @Override
    public double getBMI() {
        double heightInM = ((heightFt * 30.48) + (heightIn * 2.54)) / 100.0;
        return weightKg / (heightInM * heightInM);
    }
}