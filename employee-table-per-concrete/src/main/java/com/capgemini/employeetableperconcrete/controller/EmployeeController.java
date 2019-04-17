package com.capgemini.employeetableperconcrete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeetableperconcrete.employee.Employee;
import com.capgemini.employeetableperconcrete.employee.contract.ContractEmployee;
import com.capgemini.employeetableperconcrete.employee.regular.RegularEmployee;
import com.capgemini.employeetableperconcrete.service.EmployeeService;

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
