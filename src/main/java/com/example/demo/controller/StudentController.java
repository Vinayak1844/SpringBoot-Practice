package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentService studentservice;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentservice.getStudents();
    }

    @PostMapping
    public String addStudent(@RequestBody Student student){
        return studentservice.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentservice.deleteStudent(id);
    }

}
