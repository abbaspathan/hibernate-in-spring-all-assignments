package com.capgemini.persononetoone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.persononetoone.dao.PersonDao;
import com.capgemini.persononetoone.entity.Person;
import com.capgemini.persononetoone.service.PersonService;

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

	@Override
	public Person update(int id, String name, String desc) {
		return null;
	}

}
