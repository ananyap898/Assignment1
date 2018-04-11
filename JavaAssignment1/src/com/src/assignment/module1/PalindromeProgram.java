package com.src.assignment.module1;

public class PalindromeProgram {

	public static void main(String[] args) {
		int input = 111;// input number
		int reverse = 0, reminder = 0;
		int temp = input;
		while (input > 0) {
			reminder = input % 10;
			reverse = (reverse * 10) + reminder;
			input = input / 10;
		}
		if (temp == reverse) {
			System.out.println("is pelindrum");
		} else {
			System.out.println("not pelindrum");

		}

	}

}
