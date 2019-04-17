package com.capgemini.demomysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demomysql.entity.Person;
import com.capgemini.demomysql.entity.Profile;
import com.capgemini.demomysql.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/new")
	public String addNewAccount() {
		Person person = new Person(101, "Kapil", new Profile(23, "Good Person"));
		service.add(person);
		return "Added Successful";
	}

	@RequestMapping("/update")
	public Object updateAccount() {
		service.update(101,"kapil pawar","software engineer");
		return null;
	}

	@RequestMapping("/person")
	public Person display() {

		return service.getById(101);
	}
}
