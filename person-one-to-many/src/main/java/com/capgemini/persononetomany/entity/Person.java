package com.capgemini.persononetomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persontable")
public class Person {

	@Id
	private int personId;
	
	private String personName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<PersonCar> cars;

	public Person() {
		super();
	}

	public Person(int personId, String personName, Set<PersonCar> cars) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.cars = cars;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Set<PersonCar> getCars() {
		return cars;
	}

	public void setCars(Set<PersonCar> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", cars=" + cars + "]";
	}

}
