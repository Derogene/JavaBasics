package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //testing the constructor
        Animal testAnimal = new Animal("Human", (short) 2, true);

        //testing the toString
        System.out.println(testAnimal);


        //creating Scanner var
        Scanner scanner = new Scanner(System.in)

        System.out.println("Welcome to: Create an Animal");

        //ask questions
        System.out.print("Enter A Species\nInput ");
        String speciesInput = scanner.nextLine();


        System.out.print("Enter the # of Legs\n(-32k - 32k"): ");
        short legsInput = scanner.nextShort();


        System.out.print("Does the animal live on land?\n(true/false): ");
        boolean livesOnLandInput = scanner.nextBoolean();

        //creating (Animal instance)
        Animal userGeneratedAnimal = new Animal(speciesInput, legsInput, livesOnLandInput);


        //output field values for (Animal) instance
        System.out.println(userGeneratedAnimal);
    }
}
