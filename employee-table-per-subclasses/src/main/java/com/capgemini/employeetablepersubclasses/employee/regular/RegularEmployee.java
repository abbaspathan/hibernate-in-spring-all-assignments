package com.capgemini.employeetablepersubclasses.employee.regular;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.capgemini.employeetablepersubclasses.employee.Employee;

@Entity
@Table(name="regularemployee")
public class RegularEmployee extends Employee {


	private double salary;
	private double bonus;

	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(double salary, double bonus, int employeeId, String employeeName) {
		super(employeeId, employeeName);
		this.salary = salary;
		this.bonus = bonus;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}

}
