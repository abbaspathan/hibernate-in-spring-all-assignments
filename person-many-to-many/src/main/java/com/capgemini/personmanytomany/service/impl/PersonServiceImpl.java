package com.capgemini.personmanytomany.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.personmanytomany.dao.PersonDao;
import com.capgemini.personmanytomany.entity.Person;
import com.capgemini.personmanytomany.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao dao;

	@Override
	public void add(Set<Person> person) {
		dao.saveAll(person);
	}

	@Override
	public Person getById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Person> getAll() {
		return dao.findAll();
	}

}
