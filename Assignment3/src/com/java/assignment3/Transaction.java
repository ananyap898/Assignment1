package com.java.assignment3;

import java.util.Date;

public class Transaction {
	private Date date;

	public Date getDate() {
		return date;
	}

	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getDescription() {
		return description;
	}

	private char type;
	private double amount;
	private double balance;
	private String description;
	private String name;

	public Transaction(char type, double amount, double balance, String description,String name) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		this.name = name;
		
	}

}
