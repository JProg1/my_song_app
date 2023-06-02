package com.qa.data;

import java.lang.reflect.Array;
import java.util.Collection;

// DAO = Data Access Object
public class SongDAO {
    // CRUD functionality
    // - Create, Read, Update, Delete

    public Song[] readAll() {
        return new Song[0];
    }
    public Song readById(int id) {
        return null;
    }

    public void save(Song song) {}
    public boolean deleteById(int id) {
        return false;
    }
}
