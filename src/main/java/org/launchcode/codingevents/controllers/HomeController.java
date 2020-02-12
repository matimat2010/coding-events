package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Chris Bay Updated by Matthew Alvardo: Hash Map, Table, and Bootstrap Added
 */
@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }

}
