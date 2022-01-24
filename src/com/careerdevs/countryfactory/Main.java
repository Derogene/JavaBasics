package com.careerdevs.countryfactory;

import com.careerdevs.animalfactory.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Country testCountry = new Country("Haiti", 6, "Port-au-Prince");

        System.out.println(testCountry);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to: What is your country");

        System.out.print("Enter A Country Name");
        String nameInput = scanner.nextLine();


        System.out.print("What is the population like?");
        long populationInput = scanner.nextLong();


        System.out.print("What is the country capital");
        String capitalInput = scanner.nextLine();


        Country userGeneratedCountry = new Country(nameInput, populationInput, capitalInput);

        System.out.println(userGeneratedCountry);
    }
}
