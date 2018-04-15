package com.java.assignment2;

public class StrigCompressionInjava {

	public static void main(String[] args) {
		// compressedString("aaaabbbbbcccccdddddee");
		System.out.println(compressedString("aaaabbcccc"));

	}

	private static String compressedString(String input) {
		int count = 1;
		StringBuilder sb1 = new StringBuilder();

		for (int i = 1; i < input.length(); i++) {

			if (input.charAt(i) == input.charAt(i - 1) && i < input.length() - 1) {
				count++;

			} else if (i == input.length() - 1 && input.charAt(i) == input.charAt(i - 1)) {

				count++;
				sb1.append(input.charAt(i));
				sb1.append(count);
			} else if (i == input.length() - 1 && input.charAt(i) != input.charAt(i - 1)) {

				sb1.append(input.charAt(i - 1));
				sb1.append(count);
				count = 1;
				sb1.append(input.charAt(i));
				sb1.append(count);

			} else {
				sb1.append(input.charAt(i - 1));
				sb1.append(count);
				count = 1;

			}
		}

		input = sb1.toString();
		// System.out.println(input);
		return input;

	}

}
