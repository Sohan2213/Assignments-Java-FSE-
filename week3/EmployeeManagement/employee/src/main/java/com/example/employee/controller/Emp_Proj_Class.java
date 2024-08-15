package com.example.employee.controller;

import com.example.employee.dto.Employee_DTO;
import com.example.employee.repository.Empl_DTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Emp_Proj_Class {

    private final Empl_DTO employeeRepository;

    public Emp_Proj_Class(Empl_DTO employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees/dto")
    public List<Employee_DTO> getAllEmployeeDTOs() {
        return employeeRepository.findAllEmployeeDTOs();
    }
}
