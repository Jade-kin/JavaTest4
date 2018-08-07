package com.hand.entity;

public class FilmE {
    private Long filmId;

    private String title;

    private String description;

    private Long languageId;

    public Long getFilmId() {
        return filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public void start(){
        System.out.println("Context Start");
    }

    public void stop(){
        System.out.println("Context Stop");
    }
}
