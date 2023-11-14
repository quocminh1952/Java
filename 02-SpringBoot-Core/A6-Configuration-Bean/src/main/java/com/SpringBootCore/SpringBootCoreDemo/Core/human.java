package com.SpringBootCore.SpringBootCoreDemo.Core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
public class human {

    @Bean
    public Coat outfit(){
        Coat coat = new Coat();
        coat.setSize("L");
        coat.setType("Jean");
        return coat;
    }

}
