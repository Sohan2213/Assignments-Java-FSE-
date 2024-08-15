package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void saveEmployeesInBatch(List<Employee> employees) {
        int batchSize = 50;
        for (int i = 0; i < employees.size(); i++) {
            entityManager.persist(employees.get(i));
            if (i % batchSize == 0 && i > 0) {
                entityManager.flush();
                entityManager.clear();
            }
        }
        entityManager.flush();
        entityManager.clear();
    }
}
