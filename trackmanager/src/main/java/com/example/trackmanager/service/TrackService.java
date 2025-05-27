package com.example.trackmanager.service;

import com.example.trackmanager.model.Track;
import com.example.trackmanager.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TrackService {

    @Autowired
    private TrackRepository repository;

    public List<Track> getAllTracks(String filter) {
        if (filter == null || filter.trim().isEmpty()) {
            return repository.findAll();
        } else if (!filter.matches("^[a-zA-Z0-9 _-]+$")) {
            throw new IllegalArgumentException("Invalid filter parameter");
        }
        return repository.findByTrackNameContainingIgnoreCase(filter);
    }

    public Optional<Track> getTrackById(Long id) {
        return repository.findById(id);
    }

    public Track createTrack(Track track) {
        if (track.getTrackName() == null || track.getCreator() == null ||
                track.getCreatedOn() == null || track.getPublishedOn() == null ||
                track.getDescription() == null) {
            throw new IllegalArgumentException("Invalid Data");

        }
        System.out.println(track);
        return repository.save(track);
    }
}

