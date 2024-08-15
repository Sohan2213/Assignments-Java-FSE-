package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo emp;

    public Employee saveEmployee(Employee employee) {
        return emp.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return emp.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return emp.findById(id);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        if (emp.existsById(id)) {
            employee.setId(id);
            return emp.save(employee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        emp.deleteById(id);
    }
}
