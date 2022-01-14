package com.careerdevs.sayhello;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in); //This is a field(variable)
    public static void main(String[] args) {
//        whatIsYourName(); // calling a method
//        whatIsYourFullName();
//        userSignUp();
//        simpleCalculator();

        int num = getUserIntInput("enter a number");
        String str = getUserStringInput("enter a string");
        System.out.println(num);
        System.out.println(str);

    }

    // Challenge A
    public static void whatIsYourName() {
        Scanner /* data type */ scanner = new Scanner(System.in); //variable created to take user input

        System.out.println("What is your name? ");
        String userInput = scanner.nextLine(); // variable created to store user input

        System.out.println("Hello, nice to meet you " + userInput);

    }

    //Challenge B

    public static void whatIsYourFullName() /* variable created withing scope of method */ {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name ");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name ");
        String lastName = scanner.nextLine();

        System.out.println("It is nice to formally meet you, " + firstName + " " + lastName);
    }

    public static void userSignUp () {
        String userName = getUserStringInput("Enter a username");
        String passWord = getUserStringInput("Enter a password");

        System.out.println("Thanks for signing up " + userName );

        if (passWord.length() < 5) {
            System.out.println("Your password is not very good!");
        }
    }

    public static void simpleCalculator () {
        int inputNum1 = getUserIntInput("Enter first number to add");
        int inputNum2 = getUserIntInput("Enter second number to add");

        int sumTotal = sum(inputNum1, inputNum2);

        System.out.println("The sum of " + inputNum1 + " and " + inputNum2 + " is " + sumTotal );

    }

    public static int getUserIntInput (String question) {
        System.out.println(question + "\nInt: ");
        int input = scanner.nextInt();

        //This line of code will clear the input line.
        // otherwise, the next time input is taken it will just read the leftover new-line character
//        scanner.nextLine();

        return input;

    }

    public static String getUserStringInput (String question) {
        System.out.println(question + "\nInput: ");
        return scanner.nextLine();
    }

    public static int sum (int num1, int num2) {
        return num1 + num2;
    }
}


//Command Line Interface