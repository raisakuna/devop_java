package com.wintrust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerSpringboot {
    @GetMapping("/test")
    public String sayHello(){
        return "Calling from docker spring boot";
    }
}
