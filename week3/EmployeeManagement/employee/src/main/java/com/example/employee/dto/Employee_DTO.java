package com.example.employee.dto;

public class Employee_DTO {

    private String name;
    private String email;

    public Employee_DTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
