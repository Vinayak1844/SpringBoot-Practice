package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public String addStudent(Student student){
        repository.save(student);
        return "Student Added";
    }

    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student Deleted";
    }

    public String updateStudent(int id,Student updatedStudent){
        Student student = repository.findById(id).orElse(null);

        if(student == null) return "Student not found";

        student.setName(updatedStudent.getName());
        student.setAge(updatedStudent.getAge());

        repository.save(student);
        return "Student Updated";
    }
}
