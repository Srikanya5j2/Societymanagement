package com.springboot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.main.model.Event;
import com.springboot.main.service.EventService;

@Controller
@RequestMapping("/events")
public class EventController {
@Autowired 
private EventService eventService;

@PostMapping("/add")
public Event insertEvent(@RequestBody Event event) {
    event= eventService.insertEvent(event);
    return event;
}


}
