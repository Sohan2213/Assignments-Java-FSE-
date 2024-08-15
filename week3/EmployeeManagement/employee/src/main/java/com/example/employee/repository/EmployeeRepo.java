package com.example.employee.repository;

import com.example.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentName(String departmentName);

    Employee findByEmail(String email);

    List<Employee> findByNameStartingWith(String prefix);

    List<Employee> findBySalaryGreaterThan(Double salary);
}
