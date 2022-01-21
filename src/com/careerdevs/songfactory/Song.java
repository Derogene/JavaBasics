package com.careerdevs.songfactory;

public class Song {
    public String title;
    public String artist;
    public String Genre;
    public int Seconds;

    public Song (String title, String artist, String Genre, int Seconds) {
        this.title = title;
        this.artist = artist;
        this.Genre = Genre;
        this.Seconds = Seconds;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Seconds=" + Seconds +
                '}';
    }
}
