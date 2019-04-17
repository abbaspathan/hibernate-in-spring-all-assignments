package com.capgemini.employeetablepersubclasses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeetablepersubclasses.employee.Employee;
import com.capgemini.employeetablepersubclasses.employee.contract.ContractEmployee;
import com.capgemini.employeetablepersubclasses.employee.regular.RegularEmployee;
import com.capgemini.employeetablepersubclasses.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/new")
	public String addNew() {

		Employee employee = new Employee(101, "kapil");
		Employee employee2 = new RegularEmployee(20000, 2000, 102, "krishna");
		Employee employee3 = new ContractEmployee(103, "Radha", 1000, 10);

		service.addNew(employee);
		service.addNew(employee2);
		service.addNew(employee3);

		return "Added successfully";
	}
	
	@RequestMapping("/disp")
	public List<Employee> getAll(){
		return service.getAll();
	}
}
