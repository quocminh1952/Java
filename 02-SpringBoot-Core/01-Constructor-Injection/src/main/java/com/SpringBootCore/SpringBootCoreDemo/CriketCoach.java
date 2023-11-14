package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class CriketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "this is exercise to Constructor Injection";
    }


}
