package com.java.assignment2;

public class ReplaceEmptySpaceOfString {

	public static void main(String[] args) {
		removeEmptySpace("I love India");

	}

	private static void removeEmptySpace(String input) {
		String[] words = input.split(" ");
		StringBuilder sb1 = new StringBuilder(words[0]);
		for (int i = 1; i < words.length; i++) {
			sb1.append("%20");
			sb1.append(words[i]);

		}
		System.out.println(sb1.toString());
	}

}
