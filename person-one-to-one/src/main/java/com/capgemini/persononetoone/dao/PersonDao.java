package com.capgemini.persononetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.persononetoone.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
