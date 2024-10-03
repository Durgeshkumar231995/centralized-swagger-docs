package com.cts.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.db.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
