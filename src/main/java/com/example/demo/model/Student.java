package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity   //this annotation means that create a table for this class.
public class Student {

    @Id   //primary key column
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //auto increment id.
    private int id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 1, message = "Age must be positive")
    @Max(value = 120,message = "Age should be realistic")
    private int age;

    Student() {}

    Student(String name,int age){       //no need to give Id manually now
        this.name = name;
        this.age = age;
    }

//    public void setId(int id) {this.id = id;}   // no need to set the age manually.

    public int getId(){return id;}

    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public void setAge(int age) {this.age = age;}

    public int getAge() {return age;}
}
