package com.java.assignment3;

import java.util.Date;
import java.util.Calendar;

class MyDate {
	private int day;
	private int month;
	private int year;
	private long eclapsedtime;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public MyDate() {
		
	}

	public MyDate(long eclapsedtime) {
		this.eclapsedtime = eclapsedtime;

	}
	
	
	
	

	@Override
	public String toString() {
		return "MyDate [date=" + day + ", month=" + month + ", year=" + year + "  ]";
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public long getEclapsedtime() {
		return eclapsedtime;
	}

	public void setEclapsedtime(long eclapsedtime) {
		this.eclapsedtime = eclapsedtime;
	}

	public int getDay() {
		return day;
	}

	public void show() {
		Calendar c = Calendar.getInstance(); 
		//Set time in milliseconds
		c.setTimeInMillis(this.eclapsedtime);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH); 
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Year :" + year + " Month :" + month + "Day :"+ day);
		
	}

}
