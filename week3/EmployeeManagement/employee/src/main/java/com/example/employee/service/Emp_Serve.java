package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.config.AuditorImpl;
import com.example.employee.repository.EmployeeRepo;

@Service
public class Emp_Serve {

    private EmployeeRepo employeeRepository;
    private AuditorImpl auditLogRepository;

    @Autowired
    public void EmployeeService(EmployeeRepo employeeRepository, AuditorImpl auditLogRepository) {
        this.employeeRepository = employeeRepository;
        this.auditLogRepository = auditLogRepository;
    }
}
