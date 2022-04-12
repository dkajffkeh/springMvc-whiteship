package patrick.com.springmvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import patrick.com.springmvc.service.EventService;

@Controller
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping("/events")
    public String events(Model model){
        model.addAttribute("events",eventService.getEvents());
        return "events/list";
    }

}
