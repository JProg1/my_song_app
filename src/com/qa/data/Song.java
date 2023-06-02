package com.qa.data;

import java.time.LocalDate;
import java.util.Objects;

public class Song {

    private int id;
    private String title;
    private String artist;
    private int runtime;
    private LocalDate releaseDate;

    public Song() {
    }

    public Song(String title, String artist, int runtime, LocalDate releaseDate) {
        this.title = title;
        this.artist = artist;
        this.runtime = runtime;
        this.releaseDate = releaseDate;
    }

    public Song(int id, String title, String artist, int runtime, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.runtime = runtime;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", runtime=" + runtime +
                ", releaseDate=" + releaseDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id && runtime == song.runtime && Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && Objects.equals(releaseDate, song.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, artist, runtime, releaseDate);
    }
}
