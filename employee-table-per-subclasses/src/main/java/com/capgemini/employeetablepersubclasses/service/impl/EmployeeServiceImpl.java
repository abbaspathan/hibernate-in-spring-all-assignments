package com.capgemini.employeetablepersubclasses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeetablepersubclasses.dao.EmployeeDao;
import com.capgemini.employeetablepersubclasses.employee.Employee;
import com.capgemini.employeetablepersubclasses.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	public void addNew(Employee employee) {
		dao.save(employee);
	}

	@Override
	public List<Employee> getAll() {
		return dao.findAll();
	}
}
