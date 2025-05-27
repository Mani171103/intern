package com.example.trackmanager.dto;

import java.time.LocalDate;

public class TrackDTO {

    private String trackName;
    private String creator;
    private LocalDate createdOn;
    private LocalDate publishedOn;
    private String description;

    public TrackDTO() {

    }

    public TrackDTO(String trackName, String creator, LocalDate createdOn, LocalDate publishedOn, String description) {
        this.trackName = trackName;
        this.creator = creator;
        this.createdOn = createdOn;
        this.publishedOn = publishedOn;
        this.description = description;
    }
    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDate getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(LocalDate publishedOn) {
        this.publishedOn = publishedOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}