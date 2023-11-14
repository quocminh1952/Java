package com.SpringBootCore.SpringBootCoreDemo.Core;

import org.springframework.stereotype.Component;



public class Coat {
   private String type;
   private String size;

    public Coat(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public Coat() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Coat{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
