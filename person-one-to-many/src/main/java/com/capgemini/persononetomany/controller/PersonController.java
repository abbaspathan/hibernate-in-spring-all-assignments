package com.capgemini.persononetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.persononetomany.entity.Person;
import com.capgemini.persononetomany.entity.PersonCar;
import com.capgemini.persononetomany.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/new")
	public String addNewAccount() {
		Set<PersonCar> set = new HashSet<PersonCar>();
		PersonCar car1 = new PersonCar(123, "maruti");
		PersonCar car2 = new PersonCar(678, "Audi");
		PersonCar car3 = new PersonCar(66, "Bail Gadi");
		set.add(car1);
		set.add(car2);
		set.add(car3);
		service.add(new Person(101, "kapil", set));
		return "Added Successful";
	}

	@RequestMapping("/person")
	public Person display() {

		return service.getById(101);
	}
}
