package com.avensystraining.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avensystraining.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
