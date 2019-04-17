package com.capgemini.employeetableperconcrete.employee.regular;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.capgemini.employeetableperconcrete.employee.Employee;

@Entity  
@Table(name="regularemployee")
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
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
