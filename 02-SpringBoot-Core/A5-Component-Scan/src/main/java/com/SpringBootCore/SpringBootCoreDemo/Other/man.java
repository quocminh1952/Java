package com.SpringBootCore.SpringBootCoreDemo.Other;

import org.springframework.stereotype.Component;

@Component
public class man {
    public String name;

    public man(String name) {
        this.name = name;
    }

    public man() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
