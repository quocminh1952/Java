package com.minh1952.springboot.start.strartSpringBoot.restController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    //inject properties for : coach.name , team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String teaminfo(){
        return "coach :"+ coachName +", team :"+teamName;
    }
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
