package com.example.Employee_Management_System.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Management_System.model.Employee;
import com.example.Employee_Management_System.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<?> getAll() {
         List<Employee> list = employeeService.getAll();
            return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> viewEmployee(@PathVariable("id") Long id) {
       
        Optional<Employee> view = employeeService.viewById(id);
            if(view.isPresent())
                return ResponseEntity.ok(view);
           else
           return ResponseEntity.status(404).body("Employee not found with ID:" + id);
        }

    
    @PostMapping("/addEmployee")
    public ResponseEntity<?> addEmployee(@Valid @RequestBody Employee employee) {
    Employee save = employeeService.addEmployee(employee);
            return ResponseEntity.status(201).body(save);
      
    }

    @PutMapping("/editEmployee/{id}")
    public ResponseEntity<?> editEmployeeByID(@PathVariable("id") Long id, @RequestBody Employee employee) {
        try {
            Employee edit = employeeService.editEmployee(id, employee);
            return ResponseEntity.ok(edit);
        }

        catch (Exception e) {
            return ResponseEntity.status(404).body("Employee not found with ID:" + id);
        }

    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<?> deleteEmployeeByID(@PathVariable("id") Long id) {
        try {
             employeeService.delete(id);
            return ResponseEntity.ok(id+" Employee deleted successfully");
        }

        catch (Exception e) {
            return ResponseEntity.status(404).body("Employee not found with ID:" + id);
        }
    }
    
}
