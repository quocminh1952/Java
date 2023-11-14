package com.SpringBootCore.SpringBootCoreDemo.common;

import com.SpringBootCore.SpringBootCoreDemo.common.Coach;
import org.springframework.stereotype.Component;

@Component // đánh dấu là 1 bean ..khi khởi chạy sẵn sàng tạo ra 1 bean để injection vào đối tượng khác
public class CriketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "this is exercise to Constructor Injection";
    }


}
