package com.park.eureka.server.secondary.eurekaserver2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/home/server")
public class HomeServerController {

    @GetMapping
    public String home() {
        return "Home server2!!";
    }
}
