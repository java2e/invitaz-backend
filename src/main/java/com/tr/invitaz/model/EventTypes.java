package com.tr.invitaz.model;

import com.tr.invitaz.model.audit.DateAudit;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class EventTypes extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventTypeName;

    private Long eventId;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Event> events =new HashSet<>();

    public EventTypes(String eventTypeName,Long eventId)
    {
        this.eventTypeName=eventTypeName;
        this.eventId=eventId;
    }
}
