package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.stereotype.Repository;

@Repository
public class studentRepository{
    public Student findById(String id){
        return new Student("S1","Anh",19);
    }
}
