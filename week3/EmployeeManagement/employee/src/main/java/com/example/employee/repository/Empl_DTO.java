package com.example.employee.repository;

import com.example.employee.dto.Employee_DTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Empl_DTO extends JpaRepository<Employee_DTO, Long> {

    @Query("SELECT new com.example.employeemanagementsystem.dto.EmployeeDTO(e.name, e.email) FROM Employee e")
    List<Employee_DTO> findAllEmployeeDTOs();
}
