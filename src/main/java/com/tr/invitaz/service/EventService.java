package com.tr.invitaz.service;

import com.tr.invitaz.dto.EventRequest;
import com.tr.invitaz.model.Event;
import com.tr.invitaz.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public EventRequest createEvent(EventRequest eventRequest)
    {
        System.out.println(eventRequest.getName());

        Event event = new Event().createEvent(eventRequest);

        return new EventRequest();
    }



}
