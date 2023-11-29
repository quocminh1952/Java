package com.example.Spring_Rest_CRUD.rest;

import com.example.Spring_Rest_CRUD.entity.student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class restStudentController {

    private List<student> theStudents;

    @PostConstruct

    @GetMapping("/students/")
    public List<student> getStudent(){
        List<student> theStudents = new ArrayList<>();

        theStudents.add(new student("Nguyen","Minh"));
        theStudents.add(new student("Tran","Van"));
        theStudents.add(new student("Le","Thuy"));

        return theStudents;
    }
}
