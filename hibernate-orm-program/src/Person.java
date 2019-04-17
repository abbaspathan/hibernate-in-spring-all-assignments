package com.capgemini.person.model;

import javax.persistence.*;

@Entity
public class Person{
	@Id
	private int personId;
	private String personName;

	public Person(int id,String name){
		personId=id;
		personName=name;
	}

	public String toString(){
		return "Person Id :"+personId+"\nPerson Name :"+personName;
	}
}