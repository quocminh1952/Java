package com.minh1952.springboot.start.strartSpringBoot;

import org.springframework.stereotype.Component;


public class Car implements Vehicle{

    @Override
    public void useVehicle(){
        System.out.println("user driving Car");
    }
}
