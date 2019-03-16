package com.tr.invitaz.controller;

import com.tr.invitaz.dto.EventRequest;
import com.tr.invitaz.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;


    @PostMapping("/create")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> createEvent(@Valid @RequestBody EventRequest eventRequest) {


        eventService.createEvent(eventRequest);


        return ResponseEntity.ok(new EventRequest());
    }
}
