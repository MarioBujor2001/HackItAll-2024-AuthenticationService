package com.hackitall.authenticationservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evets")
@CrossOrigin("*")
public class EventsController {
    @GetMapping()
    String sayHello(){
        return "Hello";
    }
}
