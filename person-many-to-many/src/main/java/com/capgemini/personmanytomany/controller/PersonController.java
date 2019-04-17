package com.capgemini.personmanytomany.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.personmanytomany.entity.Person;
import com.capgemini.personmanytomany.entity.Project;
import com.capgemini.personmanytomany.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/newperson")
	public String addPersonNewAccount() {
		Set<Project> set = new HashSet<Project>();

		Project project = new Project(101, "BankApp");
		Project project1 = new Project(102, "MusicApp");
		Project project2 = new Project(103, "VideoApp");

		set.add(project);
		set.add(project1);
		set.add(project2);
		
		Set<Person> set1 = new HashSet<Person>();

		Person person = new Person(201, "kapil", set);
		Person person2 = new Person(202, "krish", set);
		Person person3 = new Person(203, "Radha", set);
		
		set1.add(person);
		set1.add(person2);
		set1.add(person3);
		
		service.add(set1);

		return "Person Added Successful";
	}

	@RequestMapping("/person")
	public Person displayPerson() {

		return service.getById(202);
	}
	

	@RequestMapping("/all")
	public List<Person> displayAll() {

		return service.getAll();
	}

}
