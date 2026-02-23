package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//import Student from the model

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
