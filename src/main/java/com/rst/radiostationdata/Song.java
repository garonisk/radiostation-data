package com.rst.radiostationdata;

public class Song {

    private String artist ;
    private String title;
    private double weights;

    public Song() {

    }

    public Song(String artist, String title, double weights) {
        this.artist = artist;
        this.title = title;
        this.weights = weights;
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
}
