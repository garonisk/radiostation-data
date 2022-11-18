package com.rst.radiostationdata;

import javax.validation.constraints.NotBlank;
import java.util.UUID;


public class Song {
    @NotBlank(message = "Artist name cannot be blank")
    private String artist ;
    @NotBlank(message = "Song title cannot be blank")
    private String title;
    @NotBlank(message = "Weights cannot be blank")

    private String weights;
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

    public String getWeights() {
        return weights;
    }

    public void setWeights(String weights) {
        this.weights = weights;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
