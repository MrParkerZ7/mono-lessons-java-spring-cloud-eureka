package com.park.eureka.server.eurekaserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{appName}")
    public List<ServiceInstance> serviceInstancesByAppName(@PathVariable("appName") String appName) {
        // rReturn detail of App
        return this.discoveryClient.getInstances(appName);
    }
}