# 🏋️ BMIApp

My first Java project (Assignment 1 in Java 2 at TRU).  
It demonstrates **arrays, enhanced for-loops, inheritance, and polymorphism** by using an abstract BMI class with two concrete unit subclasses.  

---

## ✨ Features
- **Abstract base class** `MyBmi`
  - Defines abstract methods for BMI calculation and health classification
- **Subclasses**:
  - `MetricUnit` — computes BMI using metric formula (kg, m)
  - `ImperialUnit` — computes BMI using imperial formula (lbs, in)
- **Driver class** `BMIApp`:
  - Creates an **array of `MyBmi` objects** (polymorphism: can be MetricUnit or ImperialUnit)
  - Iterates with an **enhanced for-loop**
  - Prints each person’s BMI and whether they are within a healthy range

---

## 🚀 How to Run
```bash
javac *.java
java BMIApp
