package com.example.Employee_Management_System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee_Management_System.model.Employee;
import com.example.Employee_Management_System.repository.EmployeeReposiotry;

@Service
public class EmployeeService {
   @Autowired
   private EmployeeReposiotry employeeReposiotry;

   public List<Employee> getAll() {
       return employeeReposiotry.findAll();
   }

   public Employee addEmployee(Employee employee) {
       return employeeReposiotry.save(employee);
   }

   public Optional<Employee> viewById(Long id) {
      return employeeReposiotry.findById(id);
   }
   
   public Employee editEmployee(Long id, Employee employee) {
       Employee emp = employeeReposiotry.findById(id).orElseThrow();
       emp.setName(employee.getName());
       emp.setEmail(employee.getEmail());
       emp.setPhoneNo(employee.getPhoneNo());
       emp.setJobTitle(employee.getJobTitle());
       emp.setSalary(employee.getSalary());

       return employeeReposiotry.save(emp);
   }

   public void delete(Long id) {
    employeeReposiotry.deleteById(id);
   }
   
}
