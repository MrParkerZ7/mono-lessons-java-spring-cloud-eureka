package com.park.spring.eureka.client2.eurekaclient2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/home/client")
public class HomeClientController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback", groupKey = "Home", commandKey = "home", threadPoolKey = "homeThread")
    @GetMapping
    public String home() {
        String url = "http://eureka-server/rest/home/server";
        return restTemplate.getForObject(url, String.class) + "[Client2]";
    }

    public String fallback(Throwable hysirixCommand) {
        return "Client2: Server not found!!";
    }
}
