package com.capgemini.employeetableperhierarchy.service;

import java.util.List;

import com.capgemini.employeetableperhierarchy.employee.Employee;

public interface EmployeeService {
	
	public void addNew(Employee employee);
	public List<Employee> getAll();
}
