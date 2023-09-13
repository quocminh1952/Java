package com.minh1952.springboot.start.strartSpringBoot;

import org.springframework.stereotype.Component;


public class MotoBike implements Vehicle{
    @Override
    public void useVehicle() {
        System.out.println("user driving MotoBike");
    }
}
