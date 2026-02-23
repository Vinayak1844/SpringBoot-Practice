package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//import Student from the model
//this is the database access layer
//This layer handles the database operations

public interface StudentRepository extends JpaRepository<Student,Integer> {
}

// with JpaRepository you get :
//save()
//findAll()
//deleteById()
//findById()

//these are created during the runtime