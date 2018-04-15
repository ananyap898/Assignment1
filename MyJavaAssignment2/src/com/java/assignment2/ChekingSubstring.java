package com.java.assignment2;

public class ChekingSubstring {

	public static void main(String[] args) {

		if (chekSubstring("Ananya", "aqrst")) {
			System.out.println("The two string share common substring");

		} else {
			System.out.println("the two string donot share common substring");
		}

	}

	private static boolean chekSubstring(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++)
			for (int j = 0; j < str2.length(); j++)
				if (str1.charAt(i) == str2.charAt(j))

					return true;
		return false;

	}

}
