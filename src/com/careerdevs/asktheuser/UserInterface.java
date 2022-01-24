package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name");
        String userInput1 = scanner.nextLine();
        System.out.println("hello " + userInput1);

        System.out.println("What is your age?");
        byte userInput2 = scanner.nextByte();
        System.out.println("Wow " + userInput2 + " you must be so fresh and so clean, clean!");

        System.out.println("What is your favorite number?");
        short userInput3 = scanner.nextShort();
        System.out.println("oh " + userInput3 + "? " + " That is dope!");

        System.out.println("How many seashells she sells by the seashore");
        int userInput4 = scanner.nextInt();
        System.out.println(userInput4 + " was a good one");

        System.out.println("What year did the Civil Acts Right get written into law?");
        float userInput5 = scanner.nextFloat();
        System.out.println(userInput5 + " may be correct... check google!");

        System.out.println("What year were you born");
        long userInput6 = scanner.nextLong();
        System.out.println(userInput6 + " is year within the millenial era.");

        System.out.println("How many days are in a year");
        double userInput7 = scanner.nextDouble();
        System.out.println("I guess " + userInput7 + " is correct if you do not count leap years." );

        System.out.println("please enter your name \nName");
        boolean userInput8 = scanner.nextBoolean();
        System.out.println(userInput8);

    }
}
