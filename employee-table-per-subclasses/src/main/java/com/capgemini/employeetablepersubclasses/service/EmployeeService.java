package com.capgemini.employeetablepersubclasses.service;

import java.util.List;

import com.capgemini.employeetablepersubclasses.employee.Employee;

public interface EmployeeService {
	
	public void addNew(Employee employee);
	public List<Employee> getAll();
}
