package com.example.employee.controller;

import com.example.employee.projection.EmpProj;
import com.example.employee.repository.Employee_Proj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Emp_Proj_Int {

    private final Employee_Proj employeeRepository;

    public Emp_Proj_Int(Employee_Proj employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees/projection")
    public List<EmpProj> getAllEmployeesProjected() {
        return employeeRepository.findAllProjectedBy();
    }
}
