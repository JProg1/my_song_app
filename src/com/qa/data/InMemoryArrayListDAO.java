package com.qa.data;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class InMemoryArrayListDAO extends SongDAO {

    private List<Song> songs;

    public InMemoryArrayListDAO() {
        // ArrayList = resizeable list
        songs = new ArrayList<>();
    }

    public InMemoryArrayListDAO(Song[] data) {
        // List.of(data) returns an immutable list
        // - we pass it to the ArrayList constructor
        //   to make it mutable
        songs = new ArrayList<>(List.of(data));
    }

    @Override
    public List<Song> readAll() {
        return songs;
    }

    @Override
    public Song readById(int id) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getId() == id) return song;
        }
        // could also use:
//        for (Song song : songs) {
//            if (song.getId() == id) return song;
//        }
        return null; // could be better to throw an exception
    }

    @Override
    public void save(Song song) {
        if (song.getId() <= 0) return; // don't save with invalid id
        Song existingSong = readById(song.getId());

        if (existingSong != null) { // update
            existingSong.setArtist(song.getArtist());
            existingSong.setRuntime(song.getRuntime());
            existingSong.setTitle(song.getTitle());
            existingSong.setReleaseDate(song.getReleaseDate());
        } else { // save new
            // song doesn't exist, save a new one
            songs.add(song);
        }
    }

    @Override
    public boolean deleteById(int id) {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getId() == id) {
                // we are at the index of the song to remove
                songs.remove(song);
                return true; // end method early
            }
        }
        // we didn't find the song with the given id
        return false;
    }
}
