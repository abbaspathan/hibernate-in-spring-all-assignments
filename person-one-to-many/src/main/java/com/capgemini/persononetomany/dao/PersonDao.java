package com.capgemini.persononetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.persononetomany.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
