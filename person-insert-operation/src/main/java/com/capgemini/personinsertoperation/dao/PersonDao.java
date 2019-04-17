package com.capgemini.personinsertoperation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.personinsertoperation.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
