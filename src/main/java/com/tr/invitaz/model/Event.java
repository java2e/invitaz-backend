package com.tr.invitaz.model;

import com.tr.invitaz.dto.EventRequest;
import com.tr.invitaz.model.audit.DateAudit;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
public class Event extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    private String detail;

    @OneToOne
    private Location location;

    private Date startDate;

    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String img;

    @ManyToOne(fetch = FetchType.LAZY)
    private EventTypes eventType;

    private String url;

    public Event createEvent(EventRequest eventRequest)
    {
        Event event=new Event();
        event.setDetail(eventRequest.getDetail());
        event.setName(event.getName());
        event.setStartDate(eventRequest.getStartDate());
        event.setEndDate(eventRequest.getEndDate());
        event.setImg(eventRequest.getImg());

        return event;
    }

}
