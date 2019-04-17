package com.capgemini.personmanytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.personmanytomany.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
