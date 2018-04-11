package com.src.assignment.module1;

import java.util.Scanner;
/* Iterative way to find the sum of give number using for loop   */

public class SumOfNumbers {

	public static void main(String[] args) {
		/* Requesting the user give an user input */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter a positive  number :");
		int sum = 0;
		int n = sc1.nextInt();
		for (int i = 0; i <= n; i++) {
			sum = sum + i;

		}
		System.out.println("the resultant sum is :" + sum);
	}

}
