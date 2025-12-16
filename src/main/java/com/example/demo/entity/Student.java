package com.example.demo.entity;

public class Student(){

    private int id;
    private String name;
    private String email;
    private float cgpa;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    public String getEmail(){
        return email;
    }
    public void setName(String email){
        this.email =email;
    }

    public float getCgpa(){
        return name;
    }
    public void setName(float cgpa){
        this.cgpa =cgpa;
    }
}