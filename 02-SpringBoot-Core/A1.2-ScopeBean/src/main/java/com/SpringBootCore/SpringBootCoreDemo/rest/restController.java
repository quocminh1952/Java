package com.SpringBootCore.SpringBootCoreDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBootCore.SpringBootCoreDemo.Common.Coat;
import com.SpringBootCore.SpringBootCoreDemo.Common.Tshirt;
@RestController
public class restController {

    private Coat coat;
    private Tshirt tshirt;

    @Autowired
    public restController(
            @Qualifier("Coat") Coat theCoat,
            @Qualifier("Tshirt") Tshirt theTshirt
    ){
            System.out.println("In constructor : "+getClass().getSimpleName());
            coat = theCoat;
            tshirt = theTshirt;
    }


}
