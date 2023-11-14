package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// đánh dấu human là 1 bean;
//tự động tạo bean human và thêm vào applicationContext
public class human {
   // @Autowired // khi sử dụng Qualifier thì không sử dụng Autowrired
    private Outfit outfit;

    public human(@Qualifier("Tshirt") Outfit outfit){
        this.outfit = outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

}
