package com.capgemini.personinsertoperation.service;

import com.capgemini.personinsertoperation.entity.Person;

public interface PersonService {
	public void add(Person person);

	public Person getById(int id);
}
