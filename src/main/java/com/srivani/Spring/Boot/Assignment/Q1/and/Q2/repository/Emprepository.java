package com.srivani.Spring.Boot.Assignment.Q1.and.Q2.repository;

import com.srivani.Spring.Boot.Assignment.Q1.and.Q2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Emprepository extends JpaRepository<Employee,Integer> {

}
