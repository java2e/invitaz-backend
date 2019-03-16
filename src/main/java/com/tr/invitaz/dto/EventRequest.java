package com.tr.invitaz.dto;


import com.tr.invitaz.model.Location;
import lombok.Data;

import java.util.Date;

@Data
public class EventRequest {

    private String name;

    private String detail;

    private Location location;

    private Date startDate;

    private Date endDate;

    private String img;

    private Long eventTypeId;


}
