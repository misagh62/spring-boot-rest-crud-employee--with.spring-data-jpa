package com.luv2code.springbootRest.cruddemo.dao;

import com.luv2code.springbootRest.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {

}
