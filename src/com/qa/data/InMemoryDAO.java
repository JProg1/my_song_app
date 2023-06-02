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
        return super.readById(id);
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
