package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public String addStudent(Student student){
        students.add(student);
        return "Student Added";
    }

    public String deleteStudent(int id){
        students.removeIf(s -> s.getId() == id);
        return "Student Deleted";
    }

    public String updateStudent(int id,Student updatedStudent){
        for(Student student: students){
            if(student.getId() == id){
                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                return "Student " + id + " updated";
            }
        }
        return "Student "+ id+" not found";
    }
}
