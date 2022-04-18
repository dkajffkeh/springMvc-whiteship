package patrick.com.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import patrick.com.springmvc.domain.Person;

@RestController
public class EventController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("id") Person person){
        return "Hello "+person.getName();
    }

}
