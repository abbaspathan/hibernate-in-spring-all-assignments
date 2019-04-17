package com.capgemini.employeetablepersubclasses.employee.contract;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.capgemini.employeetablepersubclasses.employee.Employee;

@Entity
@Table(name="contractemployee") 
public class ContractEmployee extends Employee {

	private double payPerHour;
	private int contractPerod;

	public ContractEmployee() {
		super();

	}

	public ContractEmployee(int employeeId, String employeeName, double payPerHour, int contractPerod) {
		super(employeeId, employeeName);
		this.payPerHour = payPerHour;
		this.contractPerod = contractPerod;
	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getContractPerod() {
		return contractPerod;
	}

	public void setContractPerod(int contractPerod) {
		this.contractPerod = contractPerod;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", contractPerod=" + contractPerod + "]";
	}

}
