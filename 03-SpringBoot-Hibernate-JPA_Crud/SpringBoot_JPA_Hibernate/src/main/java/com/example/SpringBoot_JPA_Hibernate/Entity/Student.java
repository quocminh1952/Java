package com.example.SpringBoot_JPA_Hibernate.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity  // đánh dấu lớp là 1 Entity được ánh xạ sang database
@Table(name = "student") // set table_name in database
public class Student {

    //(1) define fields
    @Id // tick this field is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // use auto-increment in DB
    @Column(name ="id") // id is name of this field in DB
    private String id;

    @Column(name="first_name")
    private String first_name;
    @Column(name="last_name")
    private String last_name;
    @Column(name="email")
    private String email;


    //(2) define constructor
    public Student() {
    }
    public Student( String first_name , String last_name , String email){

        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }


    //(3) define getter/setter
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // define toString method


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
