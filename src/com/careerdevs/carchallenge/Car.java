package com.careerdevs.carchallenge;

    public class Car {
        public String make;
        public static String model;
        public int mileage;
        public float gasTankPercent;

    //Constructor


    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }
    public String toString() {
        return "testing";
    }
}