package com.careerdevs.fruitfactory;

import com.careerdevs.animalfactory.Animal;
import com.careerdevs.countryfactory.Country;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fruit testFruit = new Fruit("Apple", "Red", Yes);

        System.out.println(testFruit);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What fruit do you like");

        System.out.print("Enter A Fruit Name");
        String nameInput = scanner.nextLine();


        System.out.print("What is the population like?");
        String colorInput = scanner.nextLine();


        System.out.print("Does it have seeds?");
        boolean hasSeedsInput = scanner.nextBoolean();


        Fruit userGeneratedFruit = new Fruit(nameInput, colorInput, hasSeedsInput);

        System.out.println(userGeneratedFruit);
    }
}
