package com.capgemini.employeetableperconcrete.service;

import java.util.List;

import com.capgemini.employeetableperconcrete.employee.Employee;

public interface EmployeeService {
	
	public void addNew(Employee employee);
	public List<Employee> getAll();
}
