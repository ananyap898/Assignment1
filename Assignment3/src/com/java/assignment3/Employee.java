package com.java.assignment3;

public class Employee extends Person {

	public Employee(String name, String address, int phone, String email, String office, String salary,
			MyDate datehighered) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.datehighered = datehighered;
	}

	private String office;
	private String salary;
	MyDate datehighered = new MyDate(34355555133101L);

	

	@Override
	public String toString() {
		return "Employee [getName()=" + getName() + ", getClass()=" + getClass() + "]";
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
