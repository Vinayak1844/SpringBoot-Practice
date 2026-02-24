package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     //marks class as web controller,handles http requests and returns response directly
@RequestMapping("/student")        //Base url for all the endpoints
public class StudentController {

    @Autowired  //Dependency Injection  inject StudentService into controller
    public StudentService studentservice;

    @GetMapping     //maps url
    public List<Student> getAllStudents(){
        return studentservice.getStudents();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addStudent(@Valid @RequestBody Student student){
        return studentservice.addStudent(student);
    }
    //@RequestBody converts the JSON into java objects.

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){  //@PathVariable extracts the values from the url
        return studentservice.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id,@RequestBody Student student){
        return studentservice.updateStudent(id,student);
    }

}
