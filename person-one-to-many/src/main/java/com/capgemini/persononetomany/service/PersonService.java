package com.capgemini.persononetomany.service;

import com.capgemini.persononetomany.entity.Person;

public interface PersonService {
	public void add(Person person);

	public Person getById(int id);
}
