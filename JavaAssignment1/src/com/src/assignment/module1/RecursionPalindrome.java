package com.src.assignment.module1;

public class RecursionPalindrome {

	public static void main(String[] args) {
		//Ispelindrum(111);
	}

	int Ispelindrum(int input) {
		int reverse = 0, reminder = 0;
		int temp = input;
		while (input > 0) {
			reminder = input % 10;
			reverse = reverse * 10 + reminder;
			input = input / 10;
		}
		if (temp == reverse) {
			System.out.println(reverse);
			return reverse;

		} else {
			System.out.println("number is not pelindrum");
			return 0;
		}

	}

}
