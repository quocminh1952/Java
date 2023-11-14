package com.SpringBootCore.SpringBootCoreDemo.Common;

import org.springframework.stereotype.Component;

//Cách 1 : @Primary //khi container có nhiều hơn 1 bean
//@Primary Được ưu tiên khi inject vào object human

//Cách 2: Qualifier ( phải đặt tên cho bean )
@Component("Tshirt")
public class Tshirt implements Outfit {
    @Override
    public String wear() {
        return "wearing the Tshirt";
    }
}
