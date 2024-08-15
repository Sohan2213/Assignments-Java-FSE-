package com.example.employee.repository;
import com.example.employee.model.Employee_custom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Employee_Repo_custom extends JpaRepository<Employee_custom, Long> {
    List<Employee_custom> findByDepartmentName(@Param("departmentName") String departmentName);
    List<Employee_custom> findTopSalaries();
}
