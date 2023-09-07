package com.minh1952.springboot.start.strartSpringBoot.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/welcomeTo")
    public String welcome(){
        return "Welcome to SpringBoot";
    }

    @GetMapping("/start")
    public String start(){
        return "start the Spring ";
    }
}
