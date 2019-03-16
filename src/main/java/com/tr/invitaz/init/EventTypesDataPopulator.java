package com.tr.invitaz.init;


import com.tr.invitaz.model.EventTypes;
import com.tr.invitaz.repository.EventTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@DataPopulatorBean
public class EventTypesDataPopulator {


    @Autowired
    private EventTypesRepository eventTypesRepository;


    @PostConstruct
    public void init()
    {

        EventTypes eventTypes=new EventTypes("Düğün-Nişan Davetiyesi",1L);
        EventTypes eventTypes2=new EventTypes("Topluluk Davetiyesi",2L);
        EventTypes eventTypes3=new EventTypes("Yardım Çağrısı",3L);

        eventTypesRepository.saveAll(Arrays.asList(eventTypes,eventTypes2,eventTypes3));


    }

}
