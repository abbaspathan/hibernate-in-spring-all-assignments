package com.capgemini.persononetomany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.persononetomany.dao.PersonDao;
import com.capgemini.persononetomany.entity.Person;
import com.capgemini.persononetomany.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao dao;

	@Override
	public void add(Person person) {
		dao.save(person);
	}

	@Override
	public Person getById(int id) {
		return dao.findById(id).get();
	}
	
}
