package com.codeit.mp3;

import java.util.ArrayList;

public class Album {
    String name;
    int year;
    Artist artist;
    ArrayList<Song> track = new ArrayList<>();
    public Album(String name, int year, Artist artist){
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    public void addTrack(Song song){
        track.add(song);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Song getTrack(int index) {
        return track.get(index-1);
    }

    public void setTrack(ArrayList<Song> track) {
        this.track = track;
    }
}
