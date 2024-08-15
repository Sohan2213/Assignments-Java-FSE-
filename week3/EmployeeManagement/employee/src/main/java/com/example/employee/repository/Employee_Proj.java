package com.example.employee.repository;
import com.example.employee.model.Employee_custom;
import com.example.employee.projection.EmpProj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Employee_Proj extends JpaRepository<Employee_custom, Long> {
    @Query("SELECT e FROM Employee e")
    List<EmpProj> findAllProjectedBy();
}
