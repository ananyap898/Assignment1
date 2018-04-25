package com.java.assignment3;

public class Faculty extends Employee {
	
	public Faculty(String name, String address, int phone, String email, String office, String salary,
			MyDate datehighered, int officeHours, int rank) {
		super(name, address, phone, email, office, salary, datehighered);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty [getName()=" + getName() + ", getClass()=" + getClass() + "]";
	}

	private int officeHours;
	private int rank;

	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
