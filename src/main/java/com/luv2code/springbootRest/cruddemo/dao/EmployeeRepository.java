package com.luv2code.springbootRest.cruddemo.dao;

import com.luv2code.springbootRest.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {

}
