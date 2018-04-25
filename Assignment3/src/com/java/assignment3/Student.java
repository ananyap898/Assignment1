package com.java.assignment3;

//import java.util.ArrayList;

public class Student extends Person {

	public Student(String name, String address, int phone, String email) {
		super(name, address, phone, email);
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address, int phone, String email, String status) {
		super(name, address, phone, email);
		this.status = status;
	}

	private  String status = null;

	@Override
	public String toString() {
		return "Student [getName()=" + getName() + ", getClass()=" + getClass() + "]";
	}

	public String getStatus() {
		return status;
	}

	

}
