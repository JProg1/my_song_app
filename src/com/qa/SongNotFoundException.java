package com.qa;

public class SongNotFoundException extends RuntimeException {
    public SongNotFoundException(int id) {
        // pass a message upto the constructor of RuntimeException
        // - we can later retrieve that message if this exception gets thrown
        super("404: Song with id '" + id + "' not found!");
    }
}
