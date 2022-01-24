package com.employee.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.manager.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

