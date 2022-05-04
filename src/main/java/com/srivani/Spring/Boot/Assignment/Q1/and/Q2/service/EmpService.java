package com.srivani.Spring.Boot.Assignment.Q1.and.Q2.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srivani.Spring.Boot.Assignment.Q1.and.Q2.model.Employee;
import com.srivani.Spring.Boot.Assignment.Q1.and.Q2.repository.Emprepository;

@Service

public class EmpService {

	@Autowired
    private Emprepository repository;

    public Employee saveEmployee(Employee emp) {
        return repository.save(emp);
    }

    

    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    

    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "employee removed !! " + id;
    }

    

}
