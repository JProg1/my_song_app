package com.qa.data;

import java.lang.reflect.Array;
import java.util.Collection;

// DAO = Data Access Object
public abstract class SongDAO {
    // CRUD functionality
    // - Create, Read, Update, Delete

    public abstract Song[] readAll();
    public abstract Song readById(int id);

    public abstract void save(Song song);
    public abstract boolean deleteById(int id);
}
