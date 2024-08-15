package com.example.employee.repository;

import com.example.employee.model.Employee_custom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Employee_Repo_PgSort extends JpaRepository<Employee_custom, Long> {
    List<Employee_custom> findAll(Sort sort);
    Page<Employee_custom> findAll(Pageable pageable);
}
