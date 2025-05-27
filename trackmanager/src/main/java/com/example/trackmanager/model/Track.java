package com.example.trackmanager.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trackId;

    private String trackName;
    private String creator;
    private LocalDate createdOn;
    private LocalDate publishedOn;
    private String description;
    public Long getTrackId() {
        return trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getCreator() {
        return creator;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public LocalDate getPublishedOn() {
        return publishedOn;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.trackName;
    }
}

