package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.stereotype.Component;

@Component("Coat")
//đánh dấu là 1 bean ..sẽ được tạo 1 bean và được thêm vào thùng chứa ApplicationContext
public class Coat implements Outfit{
    public String wear(){
        return "wearing the Coat";
    }
}
