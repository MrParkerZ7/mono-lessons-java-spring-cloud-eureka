package com.park.eureka.server.eurekaserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/home/server")
public class HomeSeverController {


    @GetMapping
    public String home() {
        return "Home server!!";
    }

}
