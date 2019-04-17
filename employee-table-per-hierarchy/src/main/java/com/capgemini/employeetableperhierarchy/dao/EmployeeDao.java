package com.capgemini.employeetableperhierarchy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employeetableperhierarchy.employee.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
