package com.codeit.mp3;

import java.util.ArrayList;

public class Artist {

    private String name;
    private ArrayList<Album> albums = new ArrayList<>();

    public Artist(String name){
        this.name = name;
    }

    public void addAlbum(Album album){
        albums.add(album);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
