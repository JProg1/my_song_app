package com.qa.data;

public class InMemoryDAO extends SongDAO {

    private Song[] data;

    public InMemoryDAO() {
        data = new Song[0];
    }

    public InMemoryDAO(Song[] data) {
        this.data = data;
    }

    @Override
    public Song[] readAll() {
        return data;
    }

    @Override
    public Song readById(int id) {
        for (Song song : data) {
            if (song.getId() == id) return song;
        }
        return null; // could be better to throw an exception
    }

    @Override
    public void save(Song song) {
        super.save(song);
    }

    @Override
    public boolean deleteById(int id) {
        return super.deleteById(id);
    }
}
