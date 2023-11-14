package com.SpringBootCore.SpringBootCoreDemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct // hàm được gọi sau khi tạo bean human và quản lý
    public void postConstruct(){
        System.out.println("this method is called after create human bean");
    }

    @PreDestroy // được gọi sau khi xóa bean human
    public void preDestroy(){
        System.out.println("this method is called before delete human bean");
    }
    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

}
