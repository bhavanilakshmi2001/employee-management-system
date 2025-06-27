package com.example.Employee_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_Management_System.model.Employee;

@Repository
public interface EmployeeReposiotry extends JpaRepository<Employee,Long> {
    
}
