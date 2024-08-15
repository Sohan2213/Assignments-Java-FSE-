package com.example.employee.repository;

import com.example.employee.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

    @Query("SELECT d FROM Department d WHERE d.name = :name")
    List<Department> findDepartmentsByName(@Param("name") String name);

    @Query("SELECT d FROM Department d WHERE SIZE(d.employees) > :count")
    List<Department> findDepartmentsWithMoreEmployeesThan(@Param("count") Long count);
}
