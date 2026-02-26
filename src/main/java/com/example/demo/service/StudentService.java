package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service    //marks the business logic component it creats and manages the objects automatically
public class StudentService {

    @Autowired         //springBoot automatically injects the objects(Dependency Injection)
    private StudentRepository repository;  // inject StudentRespository into Service

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public StudentDTO getStudents(int id) {
        Student student = repository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Student not found"));
        return convertToDto(student);
    }

    public StudentDTO addStudent(StudentDTO dto){
        Student student = convertToEntity(dto);
        Student saved = repository.save(student);
        return convertToDto(saved);

    }

    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student Deleted";
    }

    public String updateStudent(int id,Student updatedStudent){
        Student student = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        student.setName(updatedStudent.getName());
        student.setAge(updatedStudent.getAge());

        repository.save(student);   //save after updating
        return "Student Updated";
    }

    public Student convertToEntity(StudentDTO dto){
        Student student = new Student();
        student.setAge(dto.getAge());
        student.setName(dto.getName());
        return student;
    }

    public StudentDTO convertToDto(Student student){
        StudentDTO dto = new StudentDTO();
        dto.setAge(student.getAge());
        dto.setName(student.getName());
        return dto;
    }
}
