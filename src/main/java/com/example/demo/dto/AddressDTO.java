package com.example.demo.dto;

import com.example.demo.model.Address;
import com.example.demo.model.Student;
import jakarta.persistence.*;

import java.util.List;

public class AddressDTO {

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

