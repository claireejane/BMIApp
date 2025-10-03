// ********************************************
// BMIApp.java
// Claire Jane  T00783917
// COMP 1131 – Assignment 1: BMI Calculator (Driver Class)
// This application creates BMI records for 6 people using both imperial
// and metric units, calculates each person's BMI, and outputs their name,
// weight, height in meters, BMI value, and BMI category.
// ********************************************

public class BMIApp {

    public static void main(String[] args) {
        MyBMI[] bmiList = new MyBMI[6];

        // ImperialUnit objects
        bmiList[0] = new ImperialUnit("Claire", 68.5, 5, 11);
        bmiList[1] = new ImperialUnit("Jennifer", 63, 5, 9);
        bmiList[2] = new ImperialUnit("Scarlett", 57, 5, 3);

        // MetricUnit objects
        bmiList[3] = new MetricUnit("Charlotte", 67.2, 175);
        bmiList[4] = new MetricUnit("Donald",  101.6, 190);
        bmiList[5] = new MetricUnit("Cath", 43.1, 157);

        for (MyBMI person : bmiList) { //this goes through every object in bmiList and calls it person while working
            System.out.println(person.getDetails());
        }
    }
}