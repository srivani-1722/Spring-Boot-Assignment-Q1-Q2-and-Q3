package com.srivani.Spring.Boot.Assignment.Q1.and.Q2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srivani.Spring.Boot.Assignment.Q1.and.Q2.model.Employee;
import com.srivani.Spring.Boot.Assignment.Q1.and.Q2.service.EmpService;

@RestController
public class EmployeeController {
	
	
	 @Autowired
	 private EmpService service;
	
	@GetMapping("/emplyees")
    public List<Employee> findAllProducts() {
        return service.getEmployees();
    }

    @GetMapping("/emplyees/{id}")
    public Employee findProductById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }
    
    @PostMapping("/addEmployee")
    public Employee addProduct(@RequestBody Employee emp) {
    	System.out.println(emp);
        return service.saveEmployee(emp);
    }
    
    @DeleteMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable int id) {
        return service.deleteEmployee(id);
    }

}
