package com.qa;

import com.qa.data.InMemoryArrayListDAO;
import com.qa.data.InMemoryDAO;
import com.qa.data.Song;
import com.qa.data.SongDAO;

import java.time.LocalDate;
import java.util.List;
/*

[15:46] Walsh, Morgan

Using the Song app example.

Create a new custom SongNotFoundException, this should inherit from RuntimeException
In the InMemoryDAO and InMemoryArrayListDAO, throw the custom exception from the readById(int id) method when a song with the specified ID does not exist
Try out the new exception code by calling dao.readById(1000) in your main method

 */
public class App {

    public static void main(String[] args) {
        Song song1 = new Song(
                1, "Frog Prince", "Keane", 300,
                LocalDate.of(2006, 6, 12)
        );
        Song song2 = new Song(
                2, "Black Summer", "Red Hot Chilli Peppers", 250,
                LocalDate.of(2022, 2, 4)
        );
        Song song3 = new Song(
                3, "Con te partiro", "Andrea Boucelli", 250,
                LocalDate.of(1990, 6, 1)
        );
        Song[] data = new Song[] { song1, song2, song3 };
        SongApp songApplication = new SongApp(new InMemoryArrayListDAO(data));
        songApplication.run();
    }
}
