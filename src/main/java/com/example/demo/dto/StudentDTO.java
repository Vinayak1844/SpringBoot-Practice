package com.example.demo.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentDTO {

    private int id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 1,message = "Invalid Age")
    @Max(value = 120,message = "Give a realistic age")
    private int age;

    public StudentDTO(){}

    public int getId() { return id;}
    public void setId(int id){ this.id = id;}

    public String getName(){ return name;}
    public void setName(String name){this.name= name;}

    public int getAge(){ return age;}
    public void setAge(int age){ this.age = age;}

}
