package com.capgemini.personinsertoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.personinsertoperation.entity.Person;
import com.capgemini.personinsertoperation.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/new")
	public String addNewAccount() {
		service.add(new Person(102, "Kapil"));
		return "Added Successful";
	}

	@RequestMapping("/person")
	public Person display() {
		
		return service.getById(102);
	}
}
