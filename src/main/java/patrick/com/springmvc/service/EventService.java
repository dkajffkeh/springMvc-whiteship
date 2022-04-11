package patrick.com.springmvc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import patrick.com.springmvc.domain.Event;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class EventService {

    public List<Event> getEvents(){
        Event event1 = Event.builder()
                .name("스프링 웹 MVC 스터디 1차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2022,4,10,10,10,0))
                .endDateTime(LocalDateTime.of(2022,4,15,10,10,0))
                .build()
                ;

        Event event2 = Event.builder()
                .name("스프링 웹 MVC 스터디 2차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2022,5,10,10,10,0))
                .endDateTime(LocalDateTime.of(2022,5,15,10,10,0))
                .build()
                ;

        return List.of(event1,event2);
    }
}
