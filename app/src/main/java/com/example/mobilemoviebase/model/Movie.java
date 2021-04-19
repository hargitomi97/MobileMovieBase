package com.example.mobilemoviebase.model;

public class Movie {

    private int imdbId;

    private String title;

    private String director;

    private int year;

    private int length;

    private String plot;

    private String imageUrl;

    public Movie(int imdbId, String title, String director, int year, int length, String plot, String imageUrl) {
        this.imdbId = imdbId;
        this.title = title;
        this.director = director;
        this.year = year;
        this.length = length;
        this.plot = plot;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
