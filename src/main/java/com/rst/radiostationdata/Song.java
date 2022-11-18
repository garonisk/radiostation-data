package com.rst.radiostationdata;

import java.util.UUID;

public class Song {

    private String artist ;
    private String title;
    private double weights;
    private String id;

    public Song() {
        this.id = UUID.randomUUID().toString();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeights() {
        return weights;
    }

    public void setWeights(double weights) {
        this.weights = weights;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
