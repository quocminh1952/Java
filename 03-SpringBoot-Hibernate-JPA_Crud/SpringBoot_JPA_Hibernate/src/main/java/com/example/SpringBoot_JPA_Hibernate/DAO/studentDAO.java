package com.example.SpringBoot_JPA_Hibernate.DAO;

import com.example.SpringBoot_JPA_Hibernate.Entity.Student;

import java.util.List;

public interface studentDAO {
    public void save(Student student);

    public Student findById(int id);

    public List<Student> findAll();

    public List<Student> findByLastName(String last_name);

    public void update(Student student);

    public void delete(int id);
}


