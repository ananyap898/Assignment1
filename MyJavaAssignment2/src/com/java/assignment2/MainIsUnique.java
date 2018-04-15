package com.java.assignment2;

public class MainIsUnique {

	public static void main(String[] args) {
		// Isunique obj = new Isunique();
		Isunique1 obj = new Isunique1();

		String input = "pip";
		// if (obj.isUniqueCharacter(input))
		if (obj.isUnique(input))
			System.out.println("unique");
		else
			System.out.println("not Unique");
	}
}
