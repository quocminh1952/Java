package com.example.Spring_Rest_CRUD.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class demoRestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello REST";
    }

}
