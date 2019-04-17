package com.capgemini.personmanytomany.service;

import java.util.List;
import java.util.Set;

import com.capgemini.personmanytomany.entity.Person;

public interface PersonService {
	public void add(Set<Person> person);

	public Person getById(int id);

	public List<Person> getAll();
}
