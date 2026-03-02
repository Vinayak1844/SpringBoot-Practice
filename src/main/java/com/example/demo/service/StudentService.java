package com.example.demo.service;

import com.example.demo.dto.AddressDTO;
import com.example.demo.dto.StudentDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Address;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        if(student.getAddresses() != null){
            student.getAddresses().forEach(address -> address.setStudent((student)));
        }
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

        if(dto.getAddresses()!= null){
            List<Address> addressList = new ArrayList<>();

            for(AddressDTO addressdto: dto.getAddresses()){
                Address address = new Address();
                address.setCity(addressdto.getCity());

                address.setStudent(student);

                addressList.add(address);
            }
            student.setAddresses(addressList);
        }


        return student;
    }

    public StudentDTO convertToDto(Student student){
        StudentDTO dto = new StudentDTO();
        dto.setAge(student.getAge());
        dto.setName(student.getName());

        if(student.getAddresses() != null){
            List<AddressDTO> addressdtoList = new ArrayList<>();

            for(Address address:student.getAddresses()){
                AddressDTO addressDTO  = new AddressDTO();
                addressDTO.setCity(addressDTO.getCity());
                addressdtoList.add(addressDTO);
            }
            dto.setAddresses(addressdtoList);
        }

        return dto;
    }
}
