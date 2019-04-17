package com.capgemini.persononetoone.service;

import com.capgemini.persononetoone.entity.Person;

public interface PersonService {
	public void add(Person person);

	public Person getById(int id);

	public Person update(int id, String name, String desc);
}
