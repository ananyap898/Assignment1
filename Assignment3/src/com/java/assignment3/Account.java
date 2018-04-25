package com.java.assignment3;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int id;
	private int name;
	private List<Transaction> transactions = new ArrayList<>();

	private double balance;
	private double yearlyinterestrate;

	public Account(int id, int name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void setYearlyinterestrate(double yearlyinterestrate) {
		this.yearlyinterestrate = yearlyinterestrate;
	}

	MyDate date = new MyDate();

	public int getId() {
		return id;
	}

	public int getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public MyDate getDate() {
		return date;
	}

	public double getMonthlyInterestRate() {
		return (yearlyinterestrate / (100 * 12));
	}

	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}

	public double withDraw(Double amount) {
		double total = (balance - amount);
		this.balance = total;
		return total;

	}

	public double deposit(Double amount) {
		double total = this.balance + amount;
		this.balance = total;
		return total;
	}

}
