package com.example.employee.service;

import com.example.employee.model.Department;
import com.example.employee.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo dept;

    public Department saveDepartment(Department department) {
        return dept.save(department);
    }

    public List<Department> getAllDepartments() {
        return dept.findAll();
    }

    public Optional<Department> getDepartmentById(Long id) {
        return dept.findById(id);
    }

    public Department updateDepartment(Long id, Department department) {
        if (dept.existsById(id)) {
            department.setId(id);
            return dept.save(department);
        }
        return null;
    }

    public void deleteDepartment(Long id) {
        dept.deleteById(id);
    }
}
