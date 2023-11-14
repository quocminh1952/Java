package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class studentService {

    @Autowired
    studentRepository studentRepository;
    public Student getStudentByIdToUpperCase(String id) {
        Student student = studentRepository.findById("S1");
        student.setName(student.getName().toUpperCase());
        return  student;
    }
}
