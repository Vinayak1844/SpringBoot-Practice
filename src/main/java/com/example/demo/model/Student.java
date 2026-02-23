package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity   //this annotation means that create a table for this class.
public class Student {

    @Id   //primary key column
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //auto increment id.
    private int id;

    private String name;
    private int age;

    Student() {}

    Student(String name,int age){       //no need to give Id manually now
        this.name = name;
        this.age = age;
    }

//    public void setId(int id) {this.id = id;}

    public int getId(){return id;}

    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public void setAge(int age) {this.age = age;}

    public int getAge() {return age;}
}
