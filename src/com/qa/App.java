package com.qa;

import com.qa.data.Song;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {

    public static void main(String[] args) {
        Song song1 = new Song(
                1, "Frog Prince", "Keane", 300,
                LocalDateTime.of(2006, 6, 12, 0, 0, 0)
        );
        Song song2 = new Song(
                2, "Black Summer", "Red Hot Chilli Peppers", 250,
                LocalDateTime.of(2022, 2, 4, 0, 0, 0)
        );
        Song song3 = new Song(
                2, "Con te partiro", "Andrea Boucelli", 250,
                LocalDateTime.of(1990, 6, 1, 0, 0, 0)
        );

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);
    }
}
