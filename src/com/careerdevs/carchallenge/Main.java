package com.careerdevs.carchallenge;

public class Main {
    public static void main(String[] args) {

        Car carOne = new car("Camaro 2SS", "Chevy", 10000, 0.10);
        Car carTwo = new car("Mustang GT Model", "Ford", 30_000, 0.50);
        Car carThree = new car("Hellcat", "Dodge", 100, 0.90);


        System.out.println(Car.make);
        System.out.println(Car.model);

    }
}


//    Make: Camaro 2SS, Model: Chevy, mileage: 10_000, (float) 0.10
//    Make: Mustang GT Model: Ford, mileage: 30000, gasTankPercent: 0.50
//
//    Make: Hellcat, Model: Dodge, mileage: 100, gasTankPercent: 0.90
