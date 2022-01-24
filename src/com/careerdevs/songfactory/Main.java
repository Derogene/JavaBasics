package com.careerdevs.songfactory;

import com.careerdevs.animalfactory.Animal;
import com.careerdevs.countryfactory.Country;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Song testSong = new Song("Hip Hop Saved my Life", "Lupe Fiasco", "Rap", 247);

        System.out.println(testSong);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name that Song");

        System.out.print("Enter the title");
        String titleInput = scanner.nextLine();


        System.out.print("Who is the arist?");
        String artistInput = scanner.nextLine();


        System.out.print("What genre is the song?");
        String genreInput = scanner.nextLine();


        System.out.print("How long is the song");
        int secondsInput = scanner.nextInt();


        Song userGeneratedSong = new Song(titleInput, artistInput, genreInput, secondsInput);

        System.out.println(userGeneratedSong);
    }
}
