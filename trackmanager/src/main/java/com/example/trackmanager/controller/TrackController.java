package com.example.trackmanager.controller;
import com.example.trackmanager.model.Track;
import com.example.trackmanager.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TrackController {

    @Autowired
    private TrackService service;

    @GetMapping("/getalltracks")
    public ResponseEntity<?> getAllTracks(@RequestParam(required = false) String filter) {
        try {
            List<Track> tracks = service.getAllTracks(filter);
            return ResponseEntity.ok(tracks);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid filter parameter");
        }
    }

    @GetMapping("/describetracks/{trackId}")
    public ResponseEntity<Map<String, Object>> getTrackById(@PathVariable Long trackId) {
        return service.getTrackById(trackId)
                .map(track -> {
                    Map<String, Object> response = new HashMap<>();
                    response.put("trackId", track.getTrackId());
                    response.put("trackName", track.getTrackName());
                    response.put("creator", track.getCreator());
                    response.put("createdOn", track.getCreatedOn());
                    response.put("publishedOn", track.getPublishedOn());
                    response.put("description", track.getDescription());
                    return ResponseEntity.ok(response);
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("error", "Track not found")));
    }

    @PostMapping("/createtrack")
    public ResponseEntity<?> createTrack(@RequestBody Track track) {
        try {
            Track savedTrack = service.createTrack(track);
            return ResponseEntity.ok(Map.of(
                    "trackId", savedTrack.getTrackId(),
                    "trackName", savedTrack.getTrackName(),
                    "creator", savedTrack.getCreator(),
                    "createdOn", savedTrack.getCreatedOn(),
                    "publishedOn", savedTrack.getPublishedOn(),
                    "description", savedTrack.getDescription()));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e);
        }
    }
}
