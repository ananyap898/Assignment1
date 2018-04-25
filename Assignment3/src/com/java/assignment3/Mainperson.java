package com.java.assignment3;

public class Mainperson {

	public static void main(String[] args) {
		Person person1 = new Person("Ananya", "PortImperial", 7187, "@gmail.com");
		
		Employee emp1 = new Employee("AP", "PORT IMPERIAL", 11111111, "a@a.com", "NJIT", "100000",
				new MyDate(100000000L));
		
		Staff staff = new Staff("AP", "PORT IMPERIAL", 11111111, "a@a.com", "NJIT", "100000",
				new MyDate(100000000L), "SE");

		System.out.println(person1);
		System.out.println(emp1);
		System.out.println(staff);

	}

}
