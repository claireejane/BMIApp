// ********************************************
// MyBMI.java
// Claire Jane  T00783917
// COMP 1131 – Assignment 1: Abstract Superclass
// This abstract class stores a person's name and weight in kg,
// and defines abstract methods for BMI calculation and analysis.
// It also includes accessors, mutators, and a constructor.
// ********************************************

abstract class MyBMI {
    protected String name;
    protected double weightKg;

    // Constructor for only name and weight in kg
    public MyBMI(String name, double weightKg) {
        this.name = name;
        this.weightKg = weightKg;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public double getWeightKg() {
        return weightKg;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    // Abstract methods
    public abstract String getDetails();
    public abstract double getBMI();
    public abstract String isNormalRange();
}
