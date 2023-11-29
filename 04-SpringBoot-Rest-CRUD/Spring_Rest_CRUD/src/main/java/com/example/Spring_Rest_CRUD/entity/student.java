package com.example.Spring_Rest_CRUD.entity;

public class student {

    private String firstName;
    private String lastName;

    public student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
