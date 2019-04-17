package com.capgemini.demomysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.demomysql.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
