package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

        Map<String, String> events = new HashMap<String, String>();

    @GetMapping
    public String displayAllEvents(Model model) {


        model.addAttribute("events", events);
        return "events/index";
    }
    //lives at /events/create
    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName, String description) {

        events.put(eventName, description);
        events.put("Become a Master Java Programmer", "Learn all aspects needed to launch into Java headfirst");
        events.put("LaunchCode", "Become career ready in just 10 months");
        events.put("JavaScript for Lyfe", "Learn how to make your websites interactive");
        return "redirect:";
    }

}
