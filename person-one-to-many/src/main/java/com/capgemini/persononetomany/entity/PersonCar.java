package com.capgemini.persononetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cartable")
public class PersonCar {

	@Id
	private int carId;
	private String carName;
	@ManyToOne
	private Person person;

	public PersonCar() {
		super();
	}

	public PersonCar(int carId, String carName) {

		this.carName = carName;
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	@Override
	public String toString() {
		return "PersonCar [carName=" + carName + ", carId=" + carId + "]";
	}

}
