package com.minh1952.springboot.start.strartSpringBoot;

import org.springframework.stereotype.Component;

public class bicycle implements Vehicle{
    @Override
    public void useVehicle() {
        System.out.println("user driving Bicycle");
    }
}
