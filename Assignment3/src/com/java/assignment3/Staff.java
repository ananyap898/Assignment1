package com.java.assignment3;

public class Staff extends Employee {

	public Staff(String name, String address, int phone, String email, String office, String salary,
			MyDate datehighered, String title) {
		super(name, address, phone, email, office, salary, datehighered);
		this.title = title;
	}

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [getName()=" + getName() + ", getClass()=" + getClass() + "]";
	}

	

}
